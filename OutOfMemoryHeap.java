package com.study.memory;

public class OutOfMemoryHeap {

	public String outOfMemory(){
		
		String str = "aaaaaaa";
		for(;;){
			str +=str;
		}
		
	}
	
	public static void main(String[] args) {
		new OutOfMemoryHeap().outOfMemory();
	}
}
