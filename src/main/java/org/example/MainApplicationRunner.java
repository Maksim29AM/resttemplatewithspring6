package org.example;

import org.example.itunes.service.ItunesService;
import org.example.sampleshawnmendes.service.ShawnMendesService;

public class MainApplicationRunner {

    ItunesService itunesService;
    ShawnMendesService shawnMendesService;

    MainApplicationRunner(ItunesService itunesService, ShawnMendesService shawnMendesService) {
        this.itunesService = itunesService;
        this.shawnMendesService = shawnMendesService;
    }

    public void run(){
        itunesService.fetchShawnMendesSongs();
//        shawnMendesService.testClient();
    }
}
