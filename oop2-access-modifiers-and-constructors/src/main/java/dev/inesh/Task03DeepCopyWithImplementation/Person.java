package dev.inesh.Task03DeepCopyWithImplementation;

import java.util.Arrays;

public class Person {
    private String name;
    private int[] scores;


    public Person(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }
    public Person() {}

    public Person(Person other) {
        this.name = other.name;
        this.scores = new int[other.scores.length];
        for(int i = 0; i < scores.length; i++) {
            scores[i] = other.scores[i];
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int element, int index) {
        this.scores[index] = element;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
