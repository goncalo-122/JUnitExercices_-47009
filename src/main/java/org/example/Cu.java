package org.example;

import org.example.Mark;

import java.util.ArrayList;

public class Cu {
    private String nameCU;
    private ArrayList<Mark> marks;
    private int totalStudents;

    public Cu(String nameCU, ArrayList<Mark> marks, int totalStudents) {
        this.nameCU = nameCU;
        this.marks = marks != null ? marks : new ArrayList<>();
        this.totalStudents = totalStudents;
    }

    public String getNameCU() {
        return nameCU;
    }

    public void insertMarkCU(int numStudent, double mark) {
        boolean found = false;
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) {
                m.setMark(mark);
                found = true;
                break;
            }
        }
        if (!found) {
            marks.add(new Mark(mark, numStudent));
        }
    }

    public double searchStudent(int numStudent) {
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) {
                return m.getMark();
            }
        }
        return -1;
    }


    public double averageCU() {
        double soma = 0;
        if (!marks.isEmpty()) {
            for (Mark m : marks) {
                soma += m.getMark();
            }
            return soma / marks.size();  // Correção aqui para garantir o cálculo correto da média
        }
        return 0;
    }

    public boolean isApproved(int numStudent) {
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
}
