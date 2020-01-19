package org.alexkrechet.training.configuration;

import org.alexkrechet.training.configuration.entity.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main (String [] arg){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}
