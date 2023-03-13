package com.saber.springquerydsldemo.services;

import com.saber.springquerydsldemo.model.command.PersonCommand;
import com.saber.springquerydsldemo.model.query.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person findByNationalCode(String nationalCode);
    PersonCommand save(PersonCommand personCommand);
}
