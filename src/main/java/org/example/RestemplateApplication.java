package org.example;


import java.util.Arrays;
import java.util.List;
import org.example.itunes.proxy.ItunesProxy;
import org.example.itunes.service.ItunesMapper;
import org.example.itunes.service.ItunesService;
import org.example.myresttemplate.RestTemplate;
import org.example.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;
import org.example.sampleshawnmendes.service.ShawnMendesService;
import org.example.sampleshawnmendes.service.ShawnMendesServiceMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.util.SystemPropertyUtils;

@ComponentScan
public class RestemplateApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                RestemplateApplication.class
        );
        ShawnMendesService shawnMendesService = annotationConfigApplicationContext.getBean(ShawnMendesService.class);
        shawnMendesService.testClient();

        List<String> singletonNames = Arrays.asList(annotationConfigApplicationContext.getDefaultListableBeanFactory().getSingletonNames());
        singletonNames.forEach(
                System.out::println
        );

//        ShawnMendesService shawnMendesService = new ShawnMendesService();
//        RestTemplate restTemplate = new RestTemplate();
//        shawnMendesService.setShawnMendesServiceMapper(new ShawnMendesServiceMapper());
//        shawnMendesService.sampleShawnMendesServerProxy = new SampleShawnMendesServerProxy(
//                restTemplate
//        );
//        MainApplicationRunner mainApplicationRunner = new MainApplicationRunner(
//                new ItunesService(
//                        new ItunesProxy(restTemplate),
//                        new ItunesMapper()
//                ),
//                shawnMendesService
//        );
//        mainApplicationRunner.run();
    }

}
