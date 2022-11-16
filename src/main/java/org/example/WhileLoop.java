package org.example;

import java.util.Scanner;

public class WhileLoop {
    Scanner sc;
    int numb;

    public WhileLoop() {
        sc = new Scanner(System.in);
    }

    public void sumWhileLoop() {
        int sum = 0;
        int i = 0;
        System.out.println("Enter a natural number");
        numb = sc.nextInt();
        while (i <= numb) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first" + numb + " natural number is " + sum);
    }
    public void reverseWhileLoop() {
        int reverse = 0, reminder;
        System.out.println("Enter number to reverse");
        numb = sc.nextInt();
        while (numb > 0) {
            reminder = numb % 10;
            reverse = reverse * 10 + reminder;
            numb = numb / 10;
        }
        System.out.println("The reverse number is " + reverse);
    }
}