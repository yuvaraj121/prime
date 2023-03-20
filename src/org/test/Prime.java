package org.test;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
      System.out.println(" Enter the Number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		  boolean prime = true;
		for(int i=2;i<=num/2;i++) {
			 int temp = num%i;
			if(temp==0) {
				prime = false;
				break;
			}}
			if(!prime)	
			{	
				System.out.println(num + " is not a prime number");
			}
			else
			{
				System.out.println(num+ " is a prime number");
			}
		
		}
	}


