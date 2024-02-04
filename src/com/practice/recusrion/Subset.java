package com.practice.recusrion;

public class Subset {
    void printSubset(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        String output2 =  output+ch;
        String newInput =  input.substring(1);
        printSubset(newInput, output);
        printSubset(newInput, output2);
    }

    public static void main(String[] args) {
        String s= "abcd";
        new Subset().printSubset(s, "");
    }
}
