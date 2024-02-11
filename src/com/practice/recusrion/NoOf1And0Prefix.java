package com.practice.recusrion;

public class NoOf1And0Prefix {
    public void print(int n, int n1, int n0, String output) {
        if (n == 0) {
//            System.out.println(output);
            return;
        }
        else if (n1 > n0) {
            String output1 = output + "0";
            System.out.println(output1);
            print(n-1, n1, n0 + 1, output1);
        }
            String output2 = output + "1";
            System.out.println(output2);
            print(n-1, n1 + 1, n0, output2);


    }

    public static void main(String[] args) {
        new NoOf1And0Prefix().print(4, 0, 0, "");
    }
}
