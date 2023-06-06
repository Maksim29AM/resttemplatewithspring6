package org.example.itunes.proxy;


import org.example.myresttemplate.RestTemplate;

public class ItunesProxy {

    RestTemplate restTemplate;

    //    @Value("${itunes.service.url}")
    String url;

    //    @Value("${itunes.service.port}")
    int port;

    public ItunesProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String makeGetRequest(String term, Integer limit) {
//        UriComponentsBuilder builder = UriComponentsBuilder
//                .newInstance()
//                .scheme("https")
//                .host(url)
//                .port(port)
//                .path("/search")
//                .queryParam("term", term)
//                .queryParam("limit", limit);
//        try {
//            ResponseEntity<String> response = restTemplate.exchange(
//                    builder.build().toUri(),
//                    HttpMethod.GET,
//                    null,
//                    String.class
//            );
//            return response.getBody();
//        } catch (RestClientResponseException exception) {
//            System.out.println(exception.getStatusText() + " " + exception.getStatusCode().value());
//        } catch (RestClientException exception) {
//            System.out.println(exception.getMessage());
//        }
//        return null;
    return restTemplate.exchange();

    }

}
