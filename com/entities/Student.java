package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    private String s_name;

    @OneToOne
    private Laptop lap;

    public Student() {
    }

    public Student(int s_id, String s_name, Laptop lap) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.lap = lap;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    @Override
    public String toString() {
        return "Student [s_id=" + s_id + ", s_name=" + s_name + ", lap=" + lap + "]";
    }
}
