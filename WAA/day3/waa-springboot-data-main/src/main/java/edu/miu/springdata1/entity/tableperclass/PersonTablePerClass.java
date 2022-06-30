package edu.miu.springdata1.entity.tableperclass;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PersonTablePerClass {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String firstname;
    private String lastname;
    private String email;
}
