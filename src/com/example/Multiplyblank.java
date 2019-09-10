package com.example;

public class Multiplyblank {
	public static void main(String[] args) {
		int i,j;
		System.out.print(" * |");
		for(i=1;i<=10;i++)
		{
			System.out.printf("%4d",i);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	    for(i=1;i<=10;i++)
	    {
	    	System.out.printf("%2d |",i);
	    	for(j=1;j<=10;j++)
	    	{
	    		System.out.printf("%4d",j*i);
	    	}
	    	System.out.println();
	    }
	}

}
