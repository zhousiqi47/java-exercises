package com.example;
import java.util.*;
public class InputValidation {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int counter=1;
		int input;
		int sum=0;
		double aver;
		while(counter<=3)
		{
			System.out.println("Enter the mark (0-100) for student"+counter+":");
			input=in.nextInt();
			if(input<=100&&input>=0)
			{
				sum=sum+input;
				counter++;
			}
			else
			{
				System.out.println("Invalid input,try again...");
			}
		}
		aver=(double)sum/3;
		System.out.println("You have entered :"+sum);
		System.out.println("The average of them is:"+aver);
		in.close();
	}

}
