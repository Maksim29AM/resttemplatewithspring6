package org.example;


import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.service.ItunesMapper;
import org.example.itunes.service.ItunesService;
import org.example.myresttemplate.RestTemplate;
import org.example.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;
import org.example.sampleshawnmendes.service.ShawnMendesService;
import org.example.sampleshawnmendes.service.ShawnMendesServiceMapper;

public class RestemplateApplication {

    public static void main(String[] args) {
        ShawnMendesService shawnMendesService = new ShawnMendesService();
        RestTemplate restTemplate = new RestTemplate();
        shawnMendesService.setShawnMendesServiceMapper(new ShawnMendesServiceMapper());
        shawnMendesService.sampleShawnMendesServerProxy = new SampleShawnMendesServerProxy(
                restTemplate
        );
        MainApplicationRunner mainApplicationRunner = new MainApplicationRunner(
                new ItunesService(
                        new ItunesProxy(restTemplate),
                        new ItunesMapper()
                ),
                shawnMendesService
        );
        mainApplicationRunner.run();
    }

}
