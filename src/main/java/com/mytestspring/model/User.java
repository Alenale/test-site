package com.mytestspring.model;


import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Created by alyba_000 on 12.04.2017.
 */
@Entity
@Table( name = "user_r")
public class User {
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "first_name")
    private String firstName;

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "last_name")
    private String lastName;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    @Column(name = "age")
    private int age;


    public String getEmail() { return email; }
    public void setEmail(String email) {  this.email = email; }
    @Column(name = "email")
    private String email;

    public String getPassword() { return password; }
    public void setPassword(String password) {  this.password = password; }
    @Column(name = "password")
    private String password;


    public User() {
    }

    public User(String firstName, String lastName, int age, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
    }
}