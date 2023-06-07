package org.example.sampleshawnmendes;

import org.example.myresttemplate.RestTemplate;
import org.example.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;
import org.example.sampleshawnmendes.service.ShawnMendesService;
import org.example.sampleshawnmendes.service.ShawnMendesServiceMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShawnMendesServiceConfig {

    @Bean
    SampleShawnMendesServerProxy sampleShawnMendesServerProxy() {
        return new SampleShawnMendesServerProxy(new RestTemplate());
    }

    @Bean
    ShawnMendesServiceMapper shawnMendesServiceMapper() {
        return new ShawnMendesServiceMapper();
    }

    @Bean
    ShawnMendesService shawnMendesService() {
        return new ShawnMendesService(
                sampleShawnMendesServerProxy(),
                shawnMendesServiceMapper());
    }
}
