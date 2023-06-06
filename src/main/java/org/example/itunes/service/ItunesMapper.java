package org.example.itunes.service;

import java.util.List;
import org.example.itunes.proxy.ItunesResponse;

public class ItunesMapper {

    ItunesResponse mapJsonToItunesResponse(String json) {
        return new ItunesResponse(0, List.of());
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(json, ItunesResponse.class);
    }
}
