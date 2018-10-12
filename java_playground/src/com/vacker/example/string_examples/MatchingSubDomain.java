package com.vacker.example.string_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingSubDomain {

    public static final List<String> DOMAIN_LIST = new ArrayList<>();

    public MatchingSubDomain() {
        DOMAIN_LIST.add("https://www.ipchealth.com");
        DOMAIN_LIST.add("https://narayana.ipchealth.com");
        DOMAIN_LIST.add("https://yenepoya.ipchealth.com");
    }

    public static void main(String[] args) {

        String input1 = "ipchealth.com"; //should return index 1
        String input2 = "narayana.ipchealth.com"; //should return index 2
        String input3 = "yenepoya.ipchealth.com"; //should return index 3

        if (!input1.startsWith("https://www.") && !input1.startsWith("https://")) {
        }

        if (input1.startsWith("https://www.")) {
        }

        if (input1.startsWith("https://")) {
        }

    }

}
