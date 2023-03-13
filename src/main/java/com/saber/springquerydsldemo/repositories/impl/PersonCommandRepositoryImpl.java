package com.saber.springquerydsldemo.repositories.impl;

import com.querydsl.sql.SQLQueryFactory;
import com.saber.springquerydsldemo.model.command.PersonCommand;
//import com.saber.springquerydsldemo.model.command.QPerson;
import com.saber.springquerydsldemo.repositories.PersonCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.saber.springquerydsldemo.model.command.QPerson.person;
@Repository
public class PersonCommandRepositoryImpl implements PersonCommandRepository {
//    public static final QPerson person = new QPerson("person","test2");
    @Autowired
    private SQLQueryFactory queryFactory;

    @Override
    public PersonCommand save(PersonCommand entity) {
        Integer id = queryFactory.insert(person)
                .populate(entity)
                .executeWithKey(person.id);
        entity.setId(id);
        return entity;
    }
}
