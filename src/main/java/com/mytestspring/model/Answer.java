package com.mytestspring.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by alyba_000 on 22.05.2017.
 */
@Entity
@Table( name = "passed_quest")
public class Answer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "answer")
    private String answers;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getAnswers() { return answers; }
    public void setAnswers(String answers) {this.answers = answers;  }

}
