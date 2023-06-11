package org.example.itunes.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.log4j.Log4j2;
import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.proxy.ItunesResponse;
import org.example.itunes.proxy.ItunesResult;
import org.example.songviewer.Song;
import org.example.songviewer.SongFetchable;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ItunesService implements SongFetchable {

    private final ItunesProxy iTunesClient;
    private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy iTunesClient, ItunesMapper itunesMapper) {
        this.iTunesClient = iTunesClient;
        this.itunesMapper = itunesMapper;
    }

    @Override
    public List<Song> fetchAllSongs() {
        List<ItunesResult> itunesResults = fetchShawnMendesSongsFromItunes();
        return itunesResults.stream()
                .map(itunesResult -> new Song(itunesResult.trackName()))
                .collect(Collectors.toList());
    }

    private List<ItunesResult> fetchShawnMendesSongsFromItunes() {
        String jsonSongs = iTunesClient.makeGetRequest("shawnmendes", 3);
        if (jsonSongs == null) {
            log.error("jsonSongs was null");
            return Collections.emptyList();
        }
        ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(jsonSongs);
        log.info("ItunesService fetched: " + shawnMendesResponse);
        return shawnMendesResponse.results();
    }
}
