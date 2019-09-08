package com.example;

public class ComputePI {
	public static void main(String[] args) {
		int i,j;
		double PI=0;
		int up=10000;
		for(i=1,j=1;j<=up;i=i+2,j++)
		{
			if(j%2==0)
			{
				PI=PI-(double)1/i;
			}
			else {
				PI=PI+(double)1/i;
			}
		}
		PI=PI*4;
		System.out.println("PI="+PI);
	}

}
