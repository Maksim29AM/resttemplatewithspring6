package org.example.itunes.service;

import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.proxy.ItunesResponse;

public class ItunesService {

    ItunesProxy iTunesClient;

    ItunesMapper itunesMapper;

    public ItunesService(ItunesProxy iTunesClient, ItunesMapper itunesMapper) {
        this.iTunesClient = iTunesClient;
        this.itunesMapper = itunesMapper;
    }

    public void fetchShawnMendesSongs() {
        String json = iTunesClient.makeGetRequest("shawnmendes", 3);
        if (json != null) {
            ItunesResponse shawnMendesResponse = itunesMapper.mapJsonToItunesResponse(json);
            System.out.println(shawnMendesResponse);
        }
    }
}
