package dev.inesh.copyConstructor;

public class ReattemptExam {
    private int exam_id;

    public ReattemptExam() {}

    public ReattemptExam(int exam_id) {
        this.exam_id = exam_id;
    }

    public ReattemptExam(ReattemptExam other) {
        this.exam_id = other.exam_id;
    }

}
