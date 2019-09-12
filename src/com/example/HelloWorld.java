package com.example;
import java.util.*; 
public class HelloWorld {
	public static void main(String[] args) {
		doSomething("Hello", "world", "again", "and", "again");
	      doSomething("Hello", "world");
	 
	      String[] strs = {"apple", "orange"};
	      doSomething(strs); 
	}
	public static void doSomething(String... strs) {
	      System.out.print("Arguments are: ");
	      for (String str : strs) {
	         System.out.print(str + ", ");
	      }
	      System.out.println();
	   }
	 public static void doSomething(String s1, String s2) {
	      System.out.println("Overloaded version with 2 args: " + s1 + ", " + s2);
	   }
}
