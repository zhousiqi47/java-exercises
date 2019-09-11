package com.example;
import java.util.*;
public class MagicNumber {
	public static void main(String[] args) {
		String number;
		Scanner in=new Scanner(System.in);
		System.out.println("Input a number:");
		number=in.next();
		if(isMagic(number))
		{
			System.out.println("It's a magic number");
		}
		else {
			System.out.println("it's not a magic number");
		}
		in.close();
	}
	public static boolean isMagic(String number)
	{
		int len=number.length();
		boolean jud=false;
		for(int i=0;i<len;i++)
		{
			if(number.charAt(i)=='8')
			{
				jud=true;
			}
			else
			{
				
			}
		}
		return jud;
	}

}
