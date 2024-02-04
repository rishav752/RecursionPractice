package com.practice.recusrion;

public class SpacePerm {

    void print(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        input = input.substring(1);
        print(input, output+ch);
        print(input,  output +" "+ ch);

    }

    public static void main(String[] args) {
        new SpacePerm().print("bcd", "a");
    }
}
