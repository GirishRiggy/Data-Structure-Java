package com.vacker.example.test;

public class PlayWithSwitchCase {

    public static String returnSomeValue(String criteria) {
        String value = null;

        switch (criteria) {
            case "a" :
            case "b" : value = "ab";
                break;
            case "c" :
            case "d" : value = "cd";
                break;

        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(PlayWithSwitchCase.returnSomeValue("a"));
        System.out.println(PlayWithSwitchCase.returnSomeValue("b"));
        System.out.println(PlayWithSwitchCase.returnSomeValue("c"));
        System.out.println(PlayWithSwitchCase.returnSomeValue("d"));

    }


}
