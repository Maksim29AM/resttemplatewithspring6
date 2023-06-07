package org.example.sampleshawnmendes.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ShawnMendesConfig {

    @Bean
    ShawnMendesService shawnMendesService123123(){
        ShawnMendesService shawnMendesService = new ShawnMendesService();
        shawnMendesService.setBestSongArtist("yuhuhu");
        System.out.println(shawnMendesService.bestSongArtist);
        return shawnMendesService;
    }

    @Bean
    @Primary
    ShawnMendesService shawnMendesService321321(){
        return new ShawnMendesService();
    }

    @Bean
    ShawnMendesService ajasndjkasndals(){
        return new ShawnMendesService();
    }
}
