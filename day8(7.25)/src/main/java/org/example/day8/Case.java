package org.example.day8;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class Case {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(10);
        List<Integer> list2 = new ArrayList<>(20);
        for (int i = 0; i <= 10; i++){
            list1.add(new Random().nextInt(10));
        }
        System.out.println(list1);

        for (int i = 0; i <= 20; i++){
            list2.add(new Random().nextInt(10));
        }
        System.out.println(list2);

        // 将两个数组的元素去重
        // 方法1
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println(set1);
        // 方法2
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i <= list1.size(); i++){
            set2.add(list1.get(i));
        }
        for (int i = 0; i <= list2.size(); i++){
            set2.add(list2.get(i));
        }
        System.out.println(set2);

        // LinkedHashMap，有序
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
        Set<Map.Entry<String, String>> set3 = map2.entrySet();
        for ( Map.Entry<String, String> entry : set3){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
