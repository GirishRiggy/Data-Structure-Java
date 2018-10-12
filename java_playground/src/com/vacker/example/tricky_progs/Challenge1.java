package com.vacker.example.tricky_progs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(input != null || !input.equals(" "))
            handleChallenge(input.split("[ ]+"));

    }

    public static void handleChallenge(String[] words) {

        StringBuffer output = new StringBuffer();


        try {
            for(String s : words) {
                char c = s.charAt(0);
                c = Character.toUpperCase(c);
                output.append(c+s.substring(1)+" ");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(output.toString());


    }




}
