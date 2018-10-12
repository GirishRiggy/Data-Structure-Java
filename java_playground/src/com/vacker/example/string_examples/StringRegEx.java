package com.vacker.example.string_examples;

public class StringRegEx {

    public static void main(String[] args) {
        String phone  = "918749006584";
        String str = phone.substring(0, 5) + "XXXX" + phone.substring(9);
        System.out.println(str);

    }
}
