package org.example.sampleshawnmendes.service;

import org.example.sampleshawnmendes.proxy.SampleServerShawnMendesResponse;
import org.example.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;

public class ShawnMendesService {

    public SampleShawnMendesServerProxy sampleShawnMendesServerProxy;

    ShawnMendesServiceMapper shawnMendesServiceMapper;

//    public void setSampleShawnMendesServerProxy(SampleShawnMendesServerProxy sampleShawnMendesServerProxy) {
//        this.sampleShawnMendesServerProxy = sampleShawnMendesServerProxy;
//    }

    public void setShawnMendesServiceMapper(ShawnMendesServiceMapper shawnMendesServiceMapper) {
        this.shawnMendesServiceMapper = shawnMendesServiceMapper;
    }

    public void testClient() {
        String postJsonSampleShawnMendesServer = sampleShawnMendesServerProxy.makePostRequest();
        String getJsonSampleShawnMendesServer = sampleShawnMendesServerProxy.makeGetRequest();
        if (getJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(getJsonSampleShawnMendesServer);
            System.out.println(sampleShawnMendesResponse);
        }
        sampleShawnMendesServerProxy.makeDeleteRequest("0");
        String getJsonSampleShawnMendesServer2 = sampleShawnMendesServerProxy.makeGetRequest();
        if (postJsonSampleShawnMendesServer != null) {
            SampleServerShawnMendesResponse sampleShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(postJsonSampleShawnMendesServer);
            System.out.println(sampleShawnMendesResponse);
        }

        if (getJsonSampleShawnMendesServer2 != null) {
            SampleServerShawnMendesResponse sampleShawnMendesResponse = shawnMendesServiceMapper.mapJsonToSampleShawnMendesResponse(getJsonSampleShawnMendesServer2);
            System.out.println(sampleShawnMendesResponse);
        }
    }

}
