package com.practice.recusrion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    public void sort(List<Integer> l) {
        if (l.size() < 2) {
            return;
        } else {
            int elem = l.remove(l.size()-1);
            sort(l);
            insertAtOrder(elem, l);
        }
    }

    private void insertAtOrder(int elem, List<Integer> l) {
        if (l.size() == 0 || l.get(l.size()-1) < elem) {
            int index= l.size() == 0 ? 0: l.size();
            l.add( index, elem);
        }else {
            int value = l.remove(l.size()-1);
            insertAtOrder(elem, l);
            l.add(l.size(), value);
        }
    }

    public static void main(String[] args) {
        List l= new ArrayList(Arrays.asList(7,3,2,5,6,1,7,8,2,1));
        new Sort().sort(l);
        System.out.println(l);
    }
}
