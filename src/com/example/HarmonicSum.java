package com.example;

public class HarmonicSum {
	public static void main(String[] args) {
		int up=5000;
		int i=1;
		double count=0;
		double sum=0;
		for(i=1;i<=up;i++)
		{
			count=(double)1/i;
			sum=sum+count;
		}
		System.out.println("The sum is:"+sum);
	}

}
