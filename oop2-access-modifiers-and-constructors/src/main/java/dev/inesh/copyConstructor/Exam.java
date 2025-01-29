package dev.inesh.copyConstructor;

public class Exam {
    private int id;
    private int score;
    private ReattemptExam reattemptExam;

    public Exam(){}

    public Exam(int id, int score) {
        this.id = id;
        this.score = score;
        this.reattemptExam = new ReattemptExam(1);
    }

    public Exam(Exam other){
        this.id = other.id;
        this.score = other.score;
        this.reattemptExam = new ReattemptExam(other.reattemptExam);
    }

}
