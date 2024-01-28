package com.practice.recusrion;

public class PrintN {
    public static void main(String[] args) {
        new PrintN().print(7);
    }
    void print(int n) {
        if (n==0) {
            return;
        }
        print(n-1);
        System.out.print(n +" ");

    }
}
