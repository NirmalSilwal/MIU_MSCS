package edu.miu.springdata1.entity.joinedtable;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class StudentJoined extends PersonJoined {

    private String major;
    private int tuitionFee;
}
