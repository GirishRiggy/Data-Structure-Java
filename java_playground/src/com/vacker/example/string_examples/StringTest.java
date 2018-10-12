package com.vacker.example.string_examples;

public class StringTest {
	
	public static void main(String[] args) {
		StringTest.testStringMatchesMethod(); //string matches() & regex example.
	}
	
	public static void testStringMatchesMethod() {
		String s1 = "Hello world";
		System.out.println("DOES STRING OBJ CONTAINS world ???? :: "+s1.matches(".* world"));
	}
	
	
	
	

}
