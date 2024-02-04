package com.practice.recusrion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SortStack {

    void sort(Stack<Integer> stack) {
        if (stack.size() < 2) {
            return;
        } else {
            int elem = stack.pop();
            sort(stack);
            insertSorted(stack, elem);
        }
    }

    private void insertSorted(Stack<Integer> stack, int elem) {
        if (stack.isEmpty()) {
            stack.push(elem);
            return;
        }
        int popElem = stack.pop();
        if (popElem < elem) {
            stack.push(popElem);
            stack.push(elem);
        }else {
            insertSorted(stack, elem);
            stack.push(popElem);
        }
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

        new SortStack().sort(stack);
        System.out.println(stack);
    }
}
