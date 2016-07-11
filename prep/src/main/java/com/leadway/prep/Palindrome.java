package com.leadway.prep;

import java.util.Scanner;

public class Palindrome {
	
	 private static Scanner scnr;

	 public static void main(String[] args) {
		 scnr = new Scanner (System.in);
		 String temp = "";
		System.out.println("Enter a word:");
		String word = scnr.next();	
		if (isPalindrome(word) == true) {
			System.out.println("'" + word + "'" + " is a palindrome!!");
			temp = word;
		} else{
			System.out.println("'" + word + "'"+ " is NOT a palindrome!!");
		temp = word;
			
		}
		 while (temp != "exit"){
			 
			  word = scnr.next();	
			  if (isPalindrome(word) == true) {
					System.out.println("'" + word + "'" + " is a palindrome!!");
					temp = word;
				} else{
					System.out.println("'" + word + "'"+ " is NOT a palindrome!!");
					temp = word;
				}
		}

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

