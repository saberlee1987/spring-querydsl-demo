package com.saber.springquerydsldemo.model.query;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;
@Entity
@Table(name = "persons")
@Getter
@Setter
@ToString
public class Person {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "email")
    private  String email;
    @Column(name = "nationalCode")
    private String nationalCode;
    @Column(name = "mobile")
    private String mobile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(age, person.age) && Objects.equals(email, person.email) && Objects.equals(nationalCode, person.nationalCode) && Objects.equals(mobile, person.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, email, nationalCode, mobile);
    }
}
