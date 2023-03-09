package com.saber.springquerydsldemo;

import com.saber.springquerydsldemo.model.query.Person;
import com.saber.springquerydsldemo.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringQuerydslDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringQuerydslDemoApplication.class, args);
        PersonService personService = context.getBean(PersonService.class);
        Person person = personService.findByNationalCode("0079028748");
        System.out.println(person);
    }

}
