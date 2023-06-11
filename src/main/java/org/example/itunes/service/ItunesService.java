package org.example.itunes.service;

import lombok.extern.log4j.Log4j2;
import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.proxy.ItunesResponse;
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

    public void fetchShawnMendesSongs() {
        String json = iTunesClient.makeGetRequest("shawnmendes", 3);
        if (json != null) {
            ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(json);
            log.info(shawnMendesResponse);
        }
    }
}
