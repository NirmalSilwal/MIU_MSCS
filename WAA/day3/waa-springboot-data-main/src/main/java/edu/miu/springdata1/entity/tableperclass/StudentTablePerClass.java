package edu.miu.springdata1.entity.tableperclass;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class StudentTablePerClass extends PersonTablePerClass {

    private String major;
    private int tuitionFee;
}
