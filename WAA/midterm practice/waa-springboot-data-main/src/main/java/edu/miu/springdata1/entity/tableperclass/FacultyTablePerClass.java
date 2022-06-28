package edu.miu.springdata1.entity.tableperclass;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
public class FacultyTablePerClass extends PersonTablePerClass {

    private int salary;
    private String department;

}
