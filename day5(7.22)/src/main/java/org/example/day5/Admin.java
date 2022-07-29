package org.example.day5;

import homework.Teacher;

public class Admin extends Teacher implements Action{
    @Override
    public void goClassRoomWay() {
        System.out.println("Admin goClassRoomWay" );
    }

    @Override
    public void method1() {
        System.out.println("method1" );

    }

    @Override
    public void method2() {
        System.out.println("method2" );

    }
}
