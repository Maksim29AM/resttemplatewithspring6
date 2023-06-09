package org.example.itunes.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.proxy.ItunesResponse;
import org.springframework.stereotype.Service;

@Service
public class ItunesService {

    private final ItunesProxy iTunesClient;
    private final ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy iTunesClient, ItunesMapper itunesMapper) {
        this.iTunesClient = iTunesClient;
        this.itunesMapper = itunesMapper;
    }

    public void fetchShawnMendesSongs() throws JsonProcessingException {
        String json = iTunesClient.makeGetRequest("shawnmendes", 3);
        if (json != null) {
            ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(json);
            System.out.println(shawnMendesResponse);
        }
    }
}
