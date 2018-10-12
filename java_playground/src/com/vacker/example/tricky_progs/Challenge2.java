package com.vacker.example.tricky_progs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer size = scanner.nextInt();

        for(int i =0; i<size; i ++) {
            Scanner numberScanner = new Scanner(System.in);
            numbers.add(numberScanner.nextLine());
        }

        scanner.close();
        System.out.println(numbers.size());

        /*for (int i = 0; i<size; i++){
            numbers.add(s.nextLine());
        }
        s.close();
        for (String number: numbers){
            if(validNumber(number))
                test(number);
            else
                System.out.println("NO");
        }*/

    }

    public static  Boolean validNumber(String number ) {
        long count = 0;
        count = number.chars().filter(num -> num == '0').count();
        count = number.chars().filter(num -> num == '1').count();
        count = number.chars().filter(num -> num == '8').count();
        if(count == 0)
            return false;
     return  true;
    }

    public static void test(String number) {
        int  m, a = 0,x;
        Integer num = Integer.valueOf(number);
        m = num;
        while(num > 0)
        {
            x = num % 10;
            a = a * 10 + x;
            num = num / 10;
        }

        if(num==a)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
