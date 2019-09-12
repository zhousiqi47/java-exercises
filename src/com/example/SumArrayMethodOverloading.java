package com.example;

public class SumArrayMethodOverloading {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		double[] arr2= {1.1,2.2,3.3,4.4};
		System.out.println("The sum of arr1 is:"+sumOf(arr1));
		System.out.println("The sum of arr2 is:"+sumOf(arr2));
	}
	public static int sumOf(int[] arr) {
		int sum=0;
		for(int bit:arr)
		{
			sum=+bit;
		}
		return sum;
		
	}
	public static double sumOf(double[] arr) {
		double sum=0;
		for(double bit:arr)
		{
			sum=+bit;
		}
		return sum;
		
	}

}
