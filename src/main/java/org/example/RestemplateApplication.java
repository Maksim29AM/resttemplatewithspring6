package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class RestemplateApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                RestemplateApplication.class
        );
        MainApplicationRunner runner = annotationConfigApplicationContext.getBean(MainApplicationRunner.class);
        runner.run();
    }

}
