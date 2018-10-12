package com.vacker.example.tricky_progs;

public class IncrementDecrementExamples {

	public static void main(String[] args) {
		int j = 5;
		int sum = j++ + j++; // 6+7+7 = 20
		System.out.println("sum Value :::: " +sum);
		System.out.println("j Value :::: " +j);
		
		int i = 5;
		int sum1 = i++ + ++i + ++i; // 5+7+8 = 20
		System.out.println("sum1 Value :::: " +sum1);
		System.out.println("i Value :::: " +i);
		
		
	}

}
