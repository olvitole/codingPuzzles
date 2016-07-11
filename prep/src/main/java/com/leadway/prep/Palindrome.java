package com.leadway.prep;

import java.util.Scanner;

public class Palindrome {
	
	 private static Scanner scnr;

	 public static void main(String[] args) {
		 scnr = new Scanner (System.in);
		System.out.println("Enter a word:");
		String word = scnr.next();	
		
			  do{
				 if (word.equals("exit")){
					 break;
				 }
				 else{
					 
	               if (isPalindrome(word)) {
						System.out.println("'" + word + "'" + " is a palindrome!!");
					} 
	               else{
						System.out.println("'" + word + "'"+ " is NOT a palindrome!!");
					}  
				 }
				  word = scnr.next();	  
			  } while (word != "exit"); 
		}
	 
	public static boolean isPalindrome (String word){
	    int i1 = 0;
	    int i2 = word.length() - 1;
	    while (i2 > i1) {
	        if (word.charAt(i1) != word.charAt (i2)) {
	            return false; 		
	        }
	        i1++;
	        i2--;
	    }
	    return true;
	}
	 }

