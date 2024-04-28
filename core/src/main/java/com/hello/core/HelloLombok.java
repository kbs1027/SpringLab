package com.hello.core;

import java.util.Stack;
import jdk.dynalink.beans.StaticClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main (String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("aafads");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
