package org.example;

import java.util.Scanner;

public class Operator {
    int a, b, c;
    int result1, result2, result3, result4;
    Scanner sc;
    String maxResult = null;
    String minResult = null;

    public void findMinAndMax() {
        System.out.println("Enter three numbers  a b c");
        sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        result1 = a + b * c;
        result2 = c + a / b;
        result3 = a % b + c;
        result4 = a * b + c;
        System.out.println("Max Result is " + max(result1, result2, result3, result4) + " for " + maxResult);
        System.out.println("Min Result is " + min(result1, result2, result3, result4) + " for " + minResult);

    }

    public int max(int result1, int result2, int result3, int result4) {
        int max = result1;
        maxResult = "a + b * c";
        if (result2 > max) {
            max = result2;
            maxResult = "c + a / b";
        }
        if (result3 > max) {
            max = result3;
            maxResult = "a % b + c";
        }
        if (result4 > max) {
            max = result4;
            maxResult = "a * b + c";
        }
        return max;
    }

    public int min(int result1, int result2, int result3, int result4) {
        int min = result1;
        minResult = "a + b * c";
        if (result2 < min) {
            min = result2;
            minResult = "c + a / b";
        }
        if (result3 < min) {
            min = result3;
            minResult = "a % b + c";
        }
        if (result4 < min) {
            min = result4;
            minResult = "a * b + c";
        }
        return min;
    }
}