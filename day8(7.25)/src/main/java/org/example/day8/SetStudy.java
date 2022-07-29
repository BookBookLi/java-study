package org.example.day8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args) {
        // set 的元素不能重复,无序
        Set<String> set1 = new HashSet<>();

        //O（1）,判重
        set1.add("1");

        // log(n)
        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);

        // set.contains("a");
    }
}
