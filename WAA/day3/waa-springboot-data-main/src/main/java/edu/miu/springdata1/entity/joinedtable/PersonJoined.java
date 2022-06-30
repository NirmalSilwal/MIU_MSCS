package edu.miu.springdata1.entity.joinedtable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonJoined {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String lastname;
    private String email;
}
