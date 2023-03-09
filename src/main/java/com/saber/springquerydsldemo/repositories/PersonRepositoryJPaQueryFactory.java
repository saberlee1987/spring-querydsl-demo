package com.saber.springquerydsldemo.repositories;

import com.saber.springquerydsldemo.model.query.Person;

import java.util.List;

public interface PersonRepositoryJPaQueryFactory {
    List<Person> findAll();
    Person findByNationalCode(String nationalCode);
}
