package org.example.myresttemplate;

import org.springframework.stereotype.Component;

@Component
public class RestTemplate {

    public String exchange() {
        // make HTTP request

        return "made request";
    }
}
