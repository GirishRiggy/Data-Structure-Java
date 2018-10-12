package com.vacker.example.thread_examples;

public class UsingThreadClass extends Thread {
	
	public UsingThreadClass(String tName) {
		super(tName);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" THREAD STARTED !!!!");
        try {
            Thread.sleep(1000);
            someService();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" THREAD STOPED !!!!");
	}
	
	private void someService() throws InterruptedException {
        Thread.sleep(5000);
    }

}
