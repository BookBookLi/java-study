package org.example.day8;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {
        // Map<Key, Value> map = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 1111);
        map.put("张三", 1222);// 上一个会被覆盖，一个key只能有一个value值
        Integer stuNum = map.get("张三");
        System.out.println(stuNum);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(map.getOrDefault("李四", 0));

        // map.get(Key);
        // map.put(Key, Value);
        // map.remove(Key);
        // map.remove(Key, Value);
        // map.replace(Key, Value);
        // map.containsKey(Key);
        // map.containsValue(Value);
        // map.entrySet();
        // map.getOrDefault(Key, DefaultValue);
        // map.keySet();
        // map.merge()
    }
}
