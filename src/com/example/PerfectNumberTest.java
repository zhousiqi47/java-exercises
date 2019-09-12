package com.example;
import java.util.*;
public class PerfectNumberTest {
	public static void main(String[] args) {
		int input;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		input=in.nextInt();
		int sum=0;
		for(int i=1;i<input;i++)
		{
			if(input%i==0)
			{
				sum =sum+i;
			}
			else {
				
			}
		}
		if(sum==input)
		{
			System.out.println("It's a perfect number.");
		}
		else {
			System.out.println("It's not a perfect number.");
		}
		in.close();
	}

}
