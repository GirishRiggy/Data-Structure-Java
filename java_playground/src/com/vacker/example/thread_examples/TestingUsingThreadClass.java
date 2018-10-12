package com.vacker.example.thread_examples;

public class TestingUsingThreadClass {

	public static void main(String[] args) {
		
		//upcasting
		Thread t1 = new UsingThreadClass("THREAD_0_0_1");
		Thread t2 = new UsingThreadClass("THREAD_0_0_2");
		
		//starting thread
		t1.start();
		t2.start();
	}

}
