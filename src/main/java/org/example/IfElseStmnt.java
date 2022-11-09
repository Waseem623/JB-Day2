package org.example;

import java.util.Scanner;
public class IfElseStmnt {
    private int numb;
    Scanner sc;

    public IfElseStmnt() {
        sc = new Scanner(System.in);
    }

    public void numbToWord() {
        System.out.println("Enter single digit number");
        numb = sc.nextInt();
        if (numb == 0)
            System.out.println("Zero");
        else if (numb == 1)
            System.out.println("One");
        else if (numb == 2)
            System.out.println("Two");
        else if (numb == 3)
            System.out.println("Three");
        else if (numb == 4)
            System.out.println("Four");
        else if (numb == 5)
            System.out.println("Five");
        else if (numb == 6)
            System.out.println("Six");
        else if (numb == 7)
            System.out.println("Seven");
        else if (numb == 8)
            System.out.println("Eight");
        else if (numb == 9)
            System.out.println("Nine");
        else
            System.out.println("Invalid input");
    }

    public void displayUnit() {
        String unit = null;
        System.out.println("Enter number");
        numb = sc.nextInt();
        if (numb == 1)
            unit = "Unit";
        else if (numb == 10)
            unit = "Ten";
        else if (numb == 100)
            unit = "Hundred";
        else if (numb == 1000)
            unit = "Thousand";
        System.out.println(unit);
    }
}