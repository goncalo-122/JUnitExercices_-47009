package org.example;

public class Mark {

    private int numStudent;
    private double mark;

    public Mark(double mark, int numStudent) {
        this.mark = mark;
        this.numStudent = numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public double getMark() {
        return mark;
    }
}
