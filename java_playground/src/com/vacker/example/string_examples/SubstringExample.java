package com.vacker.example.string_examples;

import com.vacker.example.utils.Constants;

public class SubstringExample {

    public static void main(String[] args) {
        String test = "arn:aws:lambda:us-east-1:453168209999:function:SiteHandler:dev";
        int lastIndex = test.lastIndexOf(":");
        String alias = test.substring(lastIndex+1, test.length());
        System.out.println(alias);

        if(alias.equalsIgnoreCase("dev")) {
            Constants.KEY = "dev";
        }
        System.out.println(Constants.KEY);
    }
}
