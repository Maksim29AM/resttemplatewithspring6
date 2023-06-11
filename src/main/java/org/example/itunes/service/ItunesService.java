package org.example.itunes.service;

import java.util.Collections;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.proxy.ItunesResponse;
import org.example.itunes.proxy.ItunesResult;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ItunesService {

    private final ItunesProxy iTunesClient;
    private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy iTunesClient, ItunesMapper itunesMapper) {
        this.iTunesClient = iTunesClient;
        this.itunesMapper = itunesMapper;
    }

    public List<ItunesResult> fetchShawnMendesSongsFromItunes() {
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
