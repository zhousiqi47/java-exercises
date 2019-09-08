package com.example;

public class datajudge {
	public static void main(String[] args) {
		int month=5;
		int day=29;
		int year=1562;
		System.out.println((year<1582)||(year==1582&&month<10)||(year==1582&&month==10&&day<15));
	}

}
