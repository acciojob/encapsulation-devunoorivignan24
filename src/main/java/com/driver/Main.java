package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw=new RWOnly();
        rw.setName("vignan");
        System.out.println(rw.getName());
    //java: name has private access in com.driver.RWOnly
        // java: name has private access in com.driver.RWOnly
    }
}