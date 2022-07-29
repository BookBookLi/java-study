package org.example.day7;

import java.util.*;


public class ListStudy {
        public static void main(String[] args) {
/**

                // 1
                //List<Integer> list1 = new List<>();
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
**/
                // 1.创建
                List<String> names = new ArrayList<String>();
                // 2.add方法
                // 作用：向集合中添加数据；
                // 格式：对象名.add（添加内容）；
                names.add("Tom");
                // 3.size()方法：
                // 作用：统计集合中有多少元素（元素可以重复储存）；
                // 格式：对象名.size()；
                int size = names.size();
                System.out.println(size);
                // 4.isEmpty()方法：
                // 作用：判断集合中是否有元素，若有则返回true；若没有，则返回false；
                // 格式：对象名.isEmpty();
                boolean flag1 = names.isEmpty();
                System.out.println(flag1);
                // 5.clear()方法：
                //作用：清空集合中的所有元素
                //格式：对象名.clear()；
                names.clear();
                boolean flag2 = names.isEmpty();
                System.out.println(flag2);
                // 6.get(index)方法：
                //作用：获取对应位置index的数据，用法与数组相似，从零开始计数。
                //格式：变量名 = 对象名.get（目标值位置）；
                names.add("Tom");
                String name1 = names.get(0);
                System.out.println(name1);
                // 7.add(index, element)方法
                //作用：在指定位置index添加数据element，并且从index开始的所有元素以此后移，
                //格式：对象名.add(index, element)
                names.add("Jack");
                names.add("Lucy");
                names.add("Tina");
                names.add(2, "names3");
                // 8.set(index, element)方法
                //作用：在指定位置index的数据替换为element
                //格式：.set(index, element)；
                names.set(0, "names1");
                // 9.遍历集合中的元素：
                //方法一：利用 .get(index) 方法实现传统数组输出方法
                for (int i = 0; i < names.size() ; i++){
                        System.out.print(names.get(i) );
                }

                //方法二：使用简便方法遍历：
                for (String name : names){
                        System.out.println(name);
                }




        }

}
