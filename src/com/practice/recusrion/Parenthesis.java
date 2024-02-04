package com.practice.recusrion;

public class Parenthesis {
    void print(int n, int open, int close, String output) {
       if (open == 0 && close == 0) {
           System.out.println(output);
           return;
       }
       if (open>0) {
           print(n, open-1, close, output+"{");
       }
       if (close > open) {
           print(n, open, close-1, output+"}");
       }


    }

    public static void main(String[] args) {
        new Parenthesis().print(6, 3, 3, "");
    }
}
