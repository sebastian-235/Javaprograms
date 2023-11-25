package javaLearnings;

import java.util.Scanner;

public class OddorEven {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Number to identify Odd or Even");

      int a = sc.nextInt();
      
      System.out.println("Input Number is " + a );

      if (a % 2 == 0) {
         System.out.println("Number " + a + " is Even");
      } else if (a % 2 == 1) {
         System.out.println("Number " + a + " is odd");
      }
      
      sc.close();
      
   }

}