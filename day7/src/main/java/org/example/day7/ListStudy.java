package org.example.day7;

import java.util.*;

public class ListStudy {
        // 1
        List<Integer> list1 = new List<>();
        List<Integer> list2 = new ArrayList<>();
        // 2
        List<Long> list3 = new ArrayList<>();
        List<Double> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();

        // 3
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        // 4
        Map<String, Integer> map1 = new HashMap<>();

        // 5
                // 申明
                List<Integer> list = new ArrayList<>();
                Integer[] arr = new Integer[10];
                // 取值
                // arr[index]
                // list.get(index)
                // 赋值
                // arr[index] = value
                // list.get(value)； 存最末尾
                // list.get(index, value); 存在指定位置
                // 判断是否包含
                // for (int i = 0; i < list.size(); i++){
                //     if (list.get(i) == value){
                //         System.out.println("包含");
                //     }
                // }
                // 是否为空
                // list.contains(value);
                // list.isEmpty();
}
