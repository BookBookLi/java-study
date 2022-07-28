package org.example.day8;

public class Node<T, E> {
    public T value;
    public E key;
    public Node next;

    public Node(T value, E key){
        this.value = value;
        this.key = key;
    }

    public static <T> void print(T data){
        System.out.println(String.valueOf(data));
    }

    public void print(T value, E key){
        System.out.println(value + ":" + key);
    }

    public static void main(String[] args) {
        print("helllo");
        print(11);
        print(111L);
        print(11.0);
        Node<String, Integer> node = new Node<>("11", 11);
    }


}
