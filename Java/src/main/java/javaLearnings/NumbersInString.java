package javaLearnings;

import java.util.Scanner;

public class NumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to Count the Numbers");
		
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		int count = 0;
		sc.close();
		
		for (int i = 0; i < string.length(); i++) {
			if(Character.isDigit(string.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("Number of digits in the String is " + count);
	}

}
