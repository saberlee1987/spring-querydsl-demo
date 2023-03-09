package com.saber.springquerydsldemo.repositories.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.saber.springquerydsldemo.model.query.Person;
import com.saber.springquerydsldemo.repositories.PersonRepositoryJPaQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import static com.saber.springquerydsldemo.model.query.QPerson.person;
@Repository
public class PersonRepositoryJPaQueryFactoryImpl implements PersonRepositoryJPaQueryFactory {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Person> findAll() {
        return jpaQueryFactory.selectFrom(person).fetch();
    }

    @Override
    public Person findByNationalCode(String nationalCode) {
        return jpaQueryFactory.selectFrom(person)
                .where(person.nationalCode.eq(nationalCode))
                .fetchOne();
    }
}
