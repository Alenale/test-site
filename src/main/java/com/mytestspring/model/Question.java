package com.mytestspring.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Created by alyba_000 on 25.05.2017.
 */
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @Column(name ="id_questions")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "question")
    private String questions;

    @Column(name ="test")
    private String testName;


    public int getTest() {  return test;  }
    public void setTest(int test) {   this.test = test;  }
    @Column( name="id_test")
    private int test;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getQuestions() { return questions; }
    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public Question(int test, String questions) {
        this.test = test;
        this.questions = questions;
    }


    public String getTestName() { return testName;  }
    public void setTestName(String testName) { this.testName = testName;  }

    public Question() {   }
}
