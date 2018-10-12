package com.vacker.example.tricky_progs;

public class BasicTickyProgs {
	
	public static void main(String[] args) {
		System.out.println("REVERSE ::::: "+reverseNumber(1000));
	}
	
	public static int reverseNumber(int num){
		int reverse = 0;
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		return reverse;
	}
}
