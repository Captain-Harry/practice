package com.harry.practice.utils;

public class UUID {

    public static String randomUUID(){
        return java.util.UUID.randomUUID().toString().replace("-","");
    }
}
