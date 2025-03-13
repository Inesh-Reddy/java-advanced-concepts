package dev.inesh.Task03DeepCopyWithImplementation;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Person person = new Person("Ronaldo", new int[]{1, 2, 3, 4, 5});
        System.out.println(person);

        Person personCopy = new Person(person);
        System.out.println(personCopy);

        //Modifying the Scores
        personCopy.getScores()[2] = 100;
        personCopy.setScores(200,0);
        //Changes is seen only in Duplicate
        System.out.println(Arrays.toString(personCopy.getScores()));
        //Changes are not seen in Original
        System.out.println(Arrays.toString(person.getScores()));
    }
}
