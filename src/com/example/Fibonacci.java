package com.example;

public class Fibonacci {
	public static void main(String[] args) {
		int before1=1,before2=1;
		int i,temp=0;
		int sum=0;
		double average;
		for(i=0;i<=20;i++)
		{
			if(i<=2)
			{
				sum=sum++;
			}
			else {
				sum=sum+before1+before2;
				temp=before1;
				before1=before2;
				before2=temp+before2;
			}
			//System.out.print(sum+" ");
		}
		average=(double)sum/20;
		System.out.println("Average="+average);
	}

}
