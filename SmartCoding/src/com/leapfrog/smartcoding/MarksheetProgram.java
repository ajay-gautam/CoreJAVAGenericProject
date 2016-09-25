/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.smartcoding;

import java.util.Scanner;
import com.leapfrog.smartcoding.Util.MarkSheet;

/**
 *
 * @author Ajay
 */
public class MarksheetProgram {

    public static void main(String[] args) {
        String[] subjects = {"Science", "Maths", "English", "Nepali"};
        Scanner input = new Scanner(System.in);
        while (true) {
            MarkSheet ms = new MarkSheet(subjects, input);
            ms.entry();

            System.out.println(ms.getTotal());

            if (ms.isFailed()) {
                System.out.println("Failed: " + ms.isFailed());
            } else {
                System.out.println(ms.getPercentage() + "%");

                System.out.println(ms.getGrade());
            }
            System.out.println("Do you want to continue [Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("N")) {
                System.exit(0);
            }
        }
    }
}
