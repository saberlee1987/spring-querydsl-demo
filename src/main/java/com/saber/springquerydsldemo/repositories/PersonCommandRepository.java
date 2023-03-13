package com.saber.springquerydsldemo.repositories;

import com.saber.springquerydsldemo.model.command.PersonCommand;

public interface PersonCommandRepository {
    PersonCommand save(PersonCommand entity);
}
