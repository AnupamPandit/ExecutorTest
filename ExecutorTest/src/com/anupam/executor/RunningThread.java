package com.anupam.executor;

public class RunningThread implements Runnable{

	
	public RunningThread(){
		System.out.println("My Constructor!!!");
	}
	
	@Override
	public void run() {
		System.out.println("My thread just Ran!!!");
		for(int i=0;i<10000;i++)
			System.out.println("Child Thread i--->"+i);
		
	}

}
