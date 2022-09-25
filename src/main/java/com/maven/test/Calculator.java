package com.maven.test;

public class Calculator {
	
	public int sum(int[] input) {
		int sum = 0;
		for(int i=0; i<input.length; i++) {
			sum = sum+input[i];
		}
		return sum;
	}
	
}
