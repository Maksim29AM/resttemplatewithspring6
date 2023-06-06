package org.example.sampleshawnmendes.proxy;


import org.example.myresttemplate.RestTemplate;
import org.springframework.stereotype.Component;

//@Component
public class SampleShawnMendesServerProxy {

//    @Autowired
    RestTemplate restTemplate;

    //    @Value("${sample-shawn-mendes-server.service.url}")
    String url;

    //    @Value("${sample-shawn-mendes-server.service.port}")
    int port;

    public SampleShawnMendesServerProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String makePostRequest() {
//        UriComponentsBuilder builder = UriComponentsBuilder
//                .newInstance()
//                .scheme("http")
//                .host(url)
//                .port(port)
//                .path("/shawn/songs");
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("requestId", "asdasdvdscsvdfvdf");
//        SampleShawnMendesRequest requestBody = new SampleShawnMendesRequest("Stitches");
//        HttpEntity<SampleShawnMendesRequest> httpEntity = new HttpEntity<>(requestBody, httpHeaders);
//        try {
//            ResponseEntity<String> response = restTemplate.exchange(
//                    builder.build().toUri(),
//                    HttpMethod.POST,
//                    httpEntity,
//                    String.class
//            );
//            return response.getBody();
//        } catch (RestClientResponseException exception) {
//            System.out.println(exception.getStatusText() + " " + exception.getStatusCode().value());
//        } catch (RestClientException exception) {
//            System.out.println(exception.getMessage());
//        }
//        return null;
        return "1";
    }


    public String makeGetRequest() {
//        UriComponentsBuilder builder = UriComponentsBuilder
//                .newInstance()
//                .scheme("http")
//                .host(url)
//                .port(port)
//                .path("/shawn/songs");
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
        return "1";
    }


    public String makeDeleteRequest(String id) {
//        UriComponentsBuilder builder = UriComponentsBuilder
//                .newInstance()
//                .scheme("http")
//                .host(url)
//                .port(port)
//                .path("/shawn/songs")
//                .queryParam("id", id);
//        try {
//            ResponseEntity<String> response = restTemplate.exchange(
//                    builder.build().toUri(),
//                    HttpMethod.DELETE,
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
        return "1";
    }

}
