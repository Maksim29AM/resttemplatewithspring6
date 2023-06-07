package org.example;


import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class RestemplateApplication {
//
//    @Autowired
//    MainApplicationRunner mainApplicationRunner;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                RestemplateApplication.class
        );
        List<String> singletonNames = Arrays.asList(annotationConfigApplicationContext.getDefaultListableBeanFactory().getSingletonNames());
        singletonNames.forEach(
                System.out::println
        );
//        mainApplicationRunner.run();
    }

}
