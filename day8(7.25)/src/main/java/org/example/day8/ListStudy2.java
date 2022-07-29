package org.example.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        // 1.ArrayList 和 LinkedList 都具有的
        List<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // list.get(index);
        // list.add(index, value);
        // list.add(value);
        // list.remove(index);
        // list.remove(list.size() - 1 );
        // list.contains(value);
        // list.isEmpty();
        // list.size();

        for (int i = 0; i <= 10; i++){
            list1.add(String.valueOf(i));
        }
        System.out.println(list1);

        // 2.LinkedList具有的
        list2.add("2");
        list2.addFirst("1");
        list2.addLast("3");

        System.out.println(list2);
        // 取值 ArrayList 快， 添加值 LinkedList 快





    }
}
