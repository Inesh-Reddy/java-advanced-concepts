package dev.inesh.Task02CopyConstructorWithReference;

import java.util.Arrays;

public class Person {
    private String name;
    private int[] scores;

    public Person(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }
    public Person() {}

    public Person(Person other){
        this.name = other.name;
        this.scores = other.scores;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
