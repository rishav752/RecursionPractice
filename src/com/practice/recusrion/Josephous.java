package com.practice.recusrion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Josephous {
    int alive(int k,List<Integer> list, int till) {
        if(list.size()== 1) {
            return list.get(0);
        } else {
            int index = (till + k - 1)%list.size();
            list.remove(index);
           return alive( k, list, index);
        }
    }

    public static void main(String[] args) {
        List l = IntStream.range(1, 41).boxed().collect(Collectors.toList());
        System.out.println(l);
        System.out.println(new Josephous().alive(7, l , 0));
    }

}
