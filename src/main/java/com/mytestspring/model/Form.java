package com.mytestspring.model;

import javax.persistence.*;

/**
 * Created by alyba_000 on 26.05.2017.
 */
@Entity
@Table( name = "test")
public class Form {

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Id
    @Column(name="id_test")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getTestName() { return testName; }
    public void setTestName(String testName) { this.testName = testName;  }
    @Column(name = "test_name")
    private String testName;


    public int getNquestions() {
        return nquestions;
    }

    public void setNquestions(int nquestions) {
        this.nquestions = nquestions;
    }

    @Column(name = "n_questions")
    private int nquestions;

    public int getBonuses() { return bonuses; }
    public void setBonuses(int bonuses) { this.bonuses = bonuses; }
    @Column(name = "n_bonuses")
    private int bonuses;

    public Form() {
    }

    public Form(String testName, int nquestions, int bonuses) {
        this.testName = testName;
        this.nquestions = nquestions;
        this.bonuses = bonuses;
    }
}