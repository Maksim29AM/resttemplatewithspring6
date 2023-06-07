package org.example.sampleshawnmendes.service;

import java.util.List;
import org.example.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;
import org.springframework.stereotype.Component;

@Component
public class ShawnMendesServiceMapper {

    SampleServerShawnMendesResponse mapJsonToSampleShawnMendesResponse(String json) {
        System.out.println("mapJsonToSampleShawnMendesResponse");
        return new SampleServerShawnMendesResponse("1", List.of());
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(json, SampleServerShawnMendesResponse.class);
    }
}
