package com.leadway.prep;

import java.util.Scanner;

public class FibonacciSeq {
	
	private static int TERMS = 15; 
	private static Scanner scnr;
	
	public static void main(String[] args) {
		int num1;
		scnr = new Scanner(System.in);
		System.out.println("Start with the number 0:");
		num1 = scnr.nextInt();
		findNext(num1);
	}
	
	public static void findNext(int num) {
		int[] fib = new int[TERMS];
		fib[0] = num;
		fib[1] = 1;
		System.out.println("The next Fibonnaci number is:" + fib[1]);
		for (int i = 2; i < fib.length;) {
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.println("The next Fibonnaci number is:" + fib[i]);
			i++;
		}
	}
}
