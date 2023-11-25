package javaLearnings;

import java.util.Scanner;

public class FtoC {

   public static void main(String[] args) {

      System.out.println("Select the Conversion needed");

      Scanner Sc = new Scanner(System.in);

      System.out.println("Enter F for Farhenheit & C for Celsius");

      String con = Sc.nextLine();

      int a = 9;
      int b = 5;
      int c = 32;

      if (con.equals("F")) {
         System.out.println("Enter the Celsius to Convert into Farhenheit");

         //Formula for Farhenheit Conversion is f = (c * 9/5) +32  c is celsius

         Scanner cel = new Scanner(System.in);
         float ce = cel.nextFloat();

         float d = ce * a;
         float e = d / b;
         float f = c + e;

         System.out.println("Converted Farhenheit is " + Math.round(f));
         cel.close();

      } else if (con.equals("C")) {
         System.out.println("Enter the Farhenheit to Convert into Celsius");

         //Formula for celsius Conversion is c = f -32 * 5/9  F is Farhenheit

         Scanner far = new Scanner(System.in);
         float far1 = far.nextFloat();

         float d1 = far1 - c;
         float e1 = d1 * b;
         float cels = e1 / a;

         System.out.println("Converted celsius is " + Math.round(cels));
         far.close();
      } else {
         System.out.println("Incorrect Option");
      }
      Sc.close();
   }

}