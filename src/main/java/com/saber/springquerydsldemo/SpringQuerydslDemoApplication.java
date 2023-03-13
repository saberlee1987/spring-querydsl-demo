package com.saber.springquerydsldemo;

import com.saber.springquerydsldemo.model.command.PersonCommand;
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
        PersonCommand personCommand = new PersonCommand();
        personCommand.setFirstName("saber");
        personCommand.setLastName("Azizi");
        personCommand.setAge(35);
        personCommand.setNationalCode("0079028748");
        personCommand.setMobile("09365627895");
        personCommand.setEmail("saberazizi66@yahoo.com");
        personService.save(personCommand);
        Person person = personService.findByNationalCode("0079028748");
        System.out.println(person);
    }

}
