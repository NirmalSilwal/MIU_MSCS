package edu.miu.springdata1.entity.singletable;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("1")
public class Faculty extends Person {

    private int salary;
    private String department;

}
