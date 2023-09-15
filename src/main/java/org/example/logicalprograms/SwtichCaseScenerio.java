package org.example.logicalprograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/* Online Java Compiler and Editor */

import java.util.*;
public class SwtichCaseScenerio{
    public static void main(String[] args) {
        String computerMove = null;
        switch ((int) (3 * Math.random())) {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Scissors";
                break;
            case 2:
                computerMove = "Paper";
                break;
        }
        System.out.println("Computer's move is " + computerMove);
        for(int i=1; i>=1; i++)
        {
            System.out.println("hy");
        }
    }
}