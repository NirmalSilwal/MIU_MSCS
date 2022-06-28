package edu.miu.springdata1.entity.joinedtable;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id_faculty")
public class FacultyJoined extends PersonJoined {

    private int salary;
    private String department;

}
