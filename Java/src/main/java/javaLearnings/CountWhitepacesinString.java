package javaLearnings;

import java.util.Scanner;

public class CountWhitepacesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to Count the Whitespaces");
		
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		int count = 0;
		sc.close();
		
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)== ' ')
			{
				count++;
			}
		}
		System.out.println("Number of Whitespaces in the String is " + count);
	}

}
