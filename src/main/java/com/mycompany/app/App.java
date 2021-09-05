package com.mycompany.app;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = in.nextLine();

    if (isPalindrome(str)) {
      System.out.println("String is a palindrome");
    } else {
      System.out.println("String is not a palindrome");
    }
  }

  public static boolean isPalindrome(String str) {
    return str.equals(new StringBuffer(str).reverse().toString());
  }
}
