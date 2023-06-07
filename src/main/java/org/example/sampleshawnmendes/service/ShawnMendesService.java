package org.example.sampleshawnmendes.service;

import org.springframework.stereotype.Component;

//@Component
public class ShawnMendesService {

    String bestSongArtist;

    public void setBestSongArtist(String bestSongArtist) {
        this.bestSongArtist = bestSongArtist;
    }

    public void testClient() {
        System.out.println("testing!");
    }

}
