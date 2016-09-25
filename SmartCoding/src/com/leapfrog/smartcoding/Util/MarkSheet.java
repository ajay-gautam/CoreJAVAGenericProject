/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.smartcoding.Util;

import java.util.Scanner;

/**
 *
 * @author Ajay
 */
public class MarkSheet {

    int passMark = 32;
    String[] subjects;
    double[] marks;
    Scanner input;

    public MarkSheet(String[] subjects, Scanner input) {
        this.subjects = subjects;
        marks = new double[this.subjects.length];
        this.input = input;
    }

    public void entry() {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter the marks for " + subjects[i]);
            marks[i] = input.nextDouble();
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < subjects.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public boolean isFailed() {
        for (int i = 0; i < subjects.length; i++) {
            if (marks[i] < passMark) {
                return true;
            }
        }
        return false;
    }

    public double getPercentage() {
        return (getTotal() / (subjects.length * 100)) * 100;
    }

    public String getGrade() {
        String grade = "";
        double percentage = getPercentage();
        if (percentage > 80) {
            grade = "distinction";
        } else if (percentage >= 60 && percentage < 80) {
            grade = "first division";
        } else if (percentage >= 45 && percentage < 60) {
            grade = "second division";
        } else if (percentage >= 32 && percentage < 45) {
            grade="third division";
        }
        return grade;
    }
}
