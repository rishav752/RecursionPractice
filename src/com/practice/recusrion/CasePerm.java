package com.practice.recusrion;

public class CasePerm {
    void printCasePerm(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        String ch =  Character.toString(input.charAt(0));
        String output1 =  output + ch.toLowerCase();
        printCasePerm(input.substring(1), output1);
        if (Character.isLetter(ch.charAt(0))) {
            String output2 = output + ch.toUpperCase();
            printCasePerm(input.substring(1), output2);
        }
    }

    public static void main(String[] args) {
        String s= "1";
        new CasePerm().printCasePerm(s, "");
    }
}
