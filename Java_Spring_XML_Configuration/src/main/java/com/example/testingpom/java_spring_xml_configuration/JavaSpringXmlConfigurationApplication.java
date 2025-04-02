package com.example.testingpom.java_spring_xml_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class JavaSpringXmlConfigurationApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("heroes.xml");

        Superman superman = (Superman) context.getBean("superman");
        WonderWoman wonderWoman1 = (WonderWoman) context.getBean("wonderWoman");
        WonderWoman wonderWoman2 = (WonderWoman) context.getBean("wonderWoman");
        TalkingCat talkingCat = (TalkingCat) context.getBean("talkingCat");

        superman.action();
        wonderWoman1.action();
        wonderWoman2.action();
        talkingCat.action();

        System.out.println("Are wonderWoman1 and wonderWoman2 the same? " + (wonderWoman1 == wonderWoman2));
    }

}
