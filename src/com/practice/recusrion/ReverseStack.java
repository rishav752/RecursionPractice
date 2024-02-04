package com.practice.recusrion;

import java.util.Stack;

public class ReverseStack {

    void reverse(Stack<Integer> stack) {
        if (stack.size() < 2) {
            return;
        } else {
            int elem = stack.pop();
            reverse(stack);
            insertAtEnd(stack, elem);
        }
    }

    private void insertAtEnd(Stack<Integer> stack, int elem) {
        if (stack.isEmpty()) {
            stack.push(elem);
            return;
        }
        int popElem = stack.pop();
        insertAtEnd(stack, elem);
        stack.push(popElem);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(23);
        stack.push(23);
        stack.push(34);
        stack.push(0);
        System.out.println(stack);

        new ReverseStack().reverse(stack);
        System.out.println(stack);
    }
}
