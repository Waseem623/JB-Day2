package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //#1) If_Else statement
        IfElseStmnt ifObj = new IfElseStmnt();
        //#1.1) Number to word
        ifObj.numbToWord();
        //#1.2) Display Unit
        ifObj.displayUnit();

        //#2) While Loop
        WhileLoop whileObj = new WhileLoop();
        whileObj.sumWhileLoop();
        whileObj.reverseWhileLoop();

        //#3) For Loop
        ForLoop forObj = new ForLoop();
        forObj.sumForLoop();
        int number = 12345;
        System.out.println(forObj.reverseForLoop(number));
        forObj.checkToPalindrome();

        //#4) Switch Statement
        SwitchStmnt switchObj = new SwitchStmnt();
        switchObj.vowelConsonant();
        switchObj.MonthName();

        //#5) Operator
        Operator oprObj = new Operator();
        oprObj.findMinAndMax();
    }
}