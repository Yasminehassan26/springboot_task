package com.example.task3.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "Grade")
    private long grade_num;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "Academic Email")
    private String email;
//Setters, getters and constructors


}