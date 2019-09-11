package com.example;
import java.util.*;
public class Dec2Hex {
	public static void main(String[] args) {
		int dec,last;
		String hex="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		dec=in.nextInt();
		char[] arr= {'0','1','2','3','4','5','6','7',
'8','9','A','B','C','D','E','F'};
		while(dec>0)
		{
			last=dec%16;
			hex=arr[last]+hex;
			dec=dec/16;
		}
		System.out.println("The equivalent hexadecimal number is "+ hex);
		in.close();
	}

}
