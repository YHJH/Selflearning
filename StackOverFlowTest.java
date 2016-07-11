package com.study.memory;

public class StackOverFlowTest {

	public void stackOverFlow(){
		for(;;){
			stackOverFlow();
		}
	}
	
	public static void main(String[] args) {
		new StackOverFlowTest().stackOverFlow();
	}
}
