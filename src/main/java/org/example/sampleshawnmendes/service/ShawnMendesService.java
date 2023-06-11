package org.example.sampleshawnmendes.service;

import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.example.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;
import org.example.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;
import org.example.songviewer.Song;
import org.example.songviewer.SongFetchable;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ShawnMendesService implements SongFetchable {

    private final SampleShawnMendesServerProxy sampleShawnMendesServerClient;
    private final ShawnMendesServiceMapper shawnMendesServiceMapper;

    public ShawnMendesService(SampleShawnMendesServerProxy sampleShawnMendesServerClient, ShawnMendesServiceMapper shawnMendesServiceMapper) {
        this.sampleShawnMendesServerClient = sampleShawnMendesServerClient;
        this.shawnMendesServiceMapper = shawnMendesServiceMapper;
    }

    @Override
    public List<Song> fetchAllSongs() {
        String songs = fetchAllShawnMendesSongsFromLocalhost();
        return List.of(new Song(songs));
    }

    private String fetchAllShawnMendesSongsFromLocalhost() {
        String jsonSongs = sampleShawnMendesServerClient.makeGetRequest();
        if (jsonSongs == null) {
            log.error("jsonSongs was null");
            return "";
        }
        SampleServerShawnMendesResponse sampleServerShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(jsonSongs);
        log.info("ShawnMendesService fetched: " + sampleServerShawnMendesResponse);
        return sampleServerShawnMendesResponse.message();
    }
}
