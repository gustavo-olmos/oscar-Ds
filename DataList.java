package org.example.model;

public class DataList {

    private String actor;
    private int age;
    private int prize;
    private String film;
    private int i;
    private int oscYear;
    private char sexo;


    public DataList(String actor, int age, int prize, String film, int i, int oscYear, char sexo) {
        this.actor = actor;
        this.age = age;
        this.prize = prize;
        this.film = film;
        this.i = i;
        this.oscYear = oscYear;
        this.sexo = sexo;
    }

    public int getAge() { return age; }
    public String getActor() {
        return actor;
    }
}
