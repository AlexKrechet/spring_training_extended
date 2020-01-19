package org.alexkrechet.training.configuration;

import org.alexkrechet.training.configuration.entity.Computer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main (String [] arg){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}