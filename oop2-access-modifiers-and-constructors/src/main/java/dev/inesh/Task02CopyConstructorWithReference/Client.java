package dev.inesh.Task02CopyConstructorWithReference;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Person person1 = new Person("Foo", new int[]{1, 2, 3});
        //Original
        System.out.println(Arrays.toString(person1.getScores()));

        //Shallow Copy
        Person person2  = new Person(person1);
        //Copy
        System.out.println(Arrays.toString(person2.getScores()));

        person2.getScores()[2] = 100;
        //Copy scores
        System.out.println(Arrays.toString(person2.getScores()));
        //Original scores
        System.out.println(Arrays.toString(person1.getScores()));
    }
}
