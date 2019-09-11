package com.example;
import java.util.*; 
public class Bin2Dec {
	public static void main(String[] args) {
		String Bio;
		int Dec=0;
		int bitnum=1;
		Scanner in= new Scanner(System.in);
		System.out.println("Please input a binary string:");
		Bio=in.next();
		int len=Bio.length();
		for(int i=len-1;i>=0;--i)
		{
			char bit=Bio.charAt(i);
			if(bit=='1')
			{    
				bitnum=1;
				for(int j=0;j<len-1-i;j++)
			    {
				    bitnum=bitnum*2;
			    }
				Dec +=bitnum;
			}
			else {
				Dec =Dec;
			}
		}
		System.out.println("The equivalent decimal for "+Bio+" is "+Dec);
		in.close();
	}

}
