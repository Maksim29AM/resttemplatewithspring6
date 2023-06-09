package org.example;


import org.example.itunes.proxy.ItunesProxy;
import org.example.sampleshawnmendes.proxy.SampleShawnMendesServerProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class RestemplateApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                RestemplateApplication.class
        );
//        ItunesProxy itunesProxy = annotationConfigApplicationContext.getBean(ItunesProxy.class);
        SampleShawnMendesServerProxy sampleShawnMendesServerProxy = annotationConfigApplicationContext.getBean(SampleShawnMendesServerProxy.class);
//        System.out.println(itunesProxy.makeGetRequest("shawnmendes", 1));
        System.out.println(sampleShawnMendesServerProxy.makeGetRequest());
        System.out.println(sampleShawnMendesServerProxy.makePostRequest());
        System.out.println(sampleShawnMendesServerProxy.makeGetRequest());

    }

}
