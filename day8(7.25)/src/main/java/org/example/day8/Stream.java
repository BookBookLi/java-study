package org.example.day8;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(20);
        for (int i = 0; i < 10; i++){
            list1.add(new Random().nextInt(10));
        }

        for (int i = 0; i < 10; i++){
            System.out.println(list1.get(i));
        }

        // 1.stream 遍历
        list1.stream().forEach(System.out::println);
        // 等价：list1.stream().forEach(o -> System.out.println(o));
        // 也即是for (int i = 0; i < 10; i++){
        //            Integer o = list1.get(i)
        //            System.out.println(o);
        //        }

        // .forEach(o -> { **语句块
        //     Integer o = list1.get(i) + 1
        //     System.out.println(o);
        //     *** })


        // 2. 排序
        list1.stream().sorted(); //默认从小到大，即o1-o2,要从大到小 o2-o1
        list1.stream()
                .sorted((o1, o2) -> o2-o1) //排序
                .distinct() //去重
                .filter(o -> o > 5) //过滤
                .forEach(o -> {System.out.println(o);}); //遍历

        //转换
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 10; i++){
            set1.add(list1.get(i));
        }

        Set<Integer> set2 = list1.stream().map(o ->{
           System.out.println(o);
           return o+1;
                } )
                .collect(Collectors.toSet());
        // collectors.toMap

        Set<String> set3 = list1.stream().map(o ->{
                    return o.toString();
                } )
                .collect(Collectors.toSet ());//stream().forEach(o -> {System.out.println(o);})
        // 并行的stream
        list1.parallelStream().collect(Collectors.toSet());



    }
}
