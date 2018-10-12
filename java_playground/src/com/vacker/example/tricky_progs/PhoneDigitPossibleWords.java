package com.vacker.example.tricky_progs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDigitPossibleWords {

    private  HashMap<Integer, String> map = new HashMap<Integer, String>();
    public PhoneDigitPossibleWords() {
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");
        map.put(0, "");
    }



    public  List<String> telephoneWords(String digits) {
        ArrayList<String> result = new ArrayList<String>();

        if(digits == null || digits.length() == 0)
            return result;

        ArrayList<Character> temp = new ArrayList<Character>();

        getWords(digits, temp, result, map);

        return result;
    }

    private  void getWords(String digits, ArrayList<Character> temp,
                          ArrayList<String> result,  HashMap<Integer, String> map){

        if(digits.length() == 0){
            char[] arr = new char[temp.size()];

            for(int i=0; i<temp.size(); i++) {
                arr[i] = temp.get(i);
            }

            result.add(String.valueOf(arr));
            return;
        }

        Integer curr = Integer.valueOf(digits.substring(0,1));
        String letters = map.get(curr);

        for(int i=0; i<letters.length(); i++) {
            temp.add(letters.charAt(i));
            //recursive function
            getWords(digits.substring(1), temp, result, map);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new PhoneDigitPossibleWords().telephoneWords("23"));
    }
}
