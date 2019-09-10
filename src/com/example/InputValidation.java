package com.example;
import javax.swing.JOptionPane;
public class InputValidation {
	public static void main(String[] args) {
		int counter=1;
		double input;
		String T;
		double sum=0;
		double aver;
		while(counter<=3)
		{
			T=JOptionPane.showInputDialog("Enter the number of the students(0-100):");
			input=Double.parseDouble(T);
			if(input<=100&&input>=0)
			{
				sum=sum+input;
				counter++;
			}
			else
			{
				System.out.println("Invalid input,try again...");
			}
		}
		aver=sum/3;
		System.out.println("You have entered :"+sum);
		System.err.println("The average of them is:"+aver);
	}

}
