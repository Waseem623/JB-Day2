package org.example;

import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class SwitchStmnt {
    Scanner sc;

    public void vowelConsonant() {
        System.out.println("Please enter a alphabet :");
        sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        toLowerCase(alphabet);
        boolean vowel;
        switch (alphabet) {
            case 'a':
                vowel = true;
                break;
            case 'e':
                vowel = true;
                break;
            case 'i':
                vowel = true;
                break;
            case 'o':
                vowel = true;
                break;
            case 'u':
                vowel = true;
                break;
            default:
                vowel = false;
                break;
        }
        if (vowel)
            System.out.println("It's vowel");
        else
            System.out.println("It's Consonant");
    }

    public void MonthName() {
        System.out.println("Please enter a month num");
        sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        String monthName = null;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(monthName);
    }
}