package org.example;

import java.util.Scanner;

public class ForLoop {
    Scanner sc;
    int numb;
    public void sumForLoop() {
        int sum = 0;
        int i = 0;
        System.out.println("Enter a natural number");
        numb = sc.nextInt();
        for (i = 0; i <= numb; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first" + numb + " natural number is " + sum);
    }

    public int reverseForLoop(int number) {
        int reverse = 0, reminder;
        for (int i=number;i>0;i=i/10) {
            reminder = i % 10;
            reverse = reverse * 10 + reminder;
        }
        return reverse;
    }

    public void checkToPalindrome() {
        System.out.println("Enter a natural number");
        numb = sc.nextInt();
        int reverse=reverseForLoop(numb);
        if(numb==reverse)
            System.out.println("It is palindrome number");
        else System.out.println("It is not palindrome number");

    }
}