package com.saber.springquerydsldemo.services.impl;

import com.saber.springquerydsldemo.model.query.Person;
import com.saber.springquerydsldemo.repositories.impl.PersonRepositoryJPaQueryFactoryImpl;
import com.saber.springquerydsldemo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonServiceImpl implements PersonService {

    @Autowired
//    private PersonRepository personRepository;
    private PersonRepositoryJPaQueryFactoryImpl personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findByNationalCode(String nationalCode) {
//        Predicate predicate = person.nationalCode.eq(nationalCode);
//        Optional<Person> personOptional = personRepository.findOne(predicate);
        Person person = personRepository.findByNationalCode(nationalCode);
        if (person!=null) {
            return person;
        } else {
            throw new RuntimeException(String.format("person with nationalCode %s does not exist", nationalCode));
        }
    }
}
