import java.lang.System;
import java.util.Scanner;

class Q1{
  public static void main(String args[])
  {
    Scanner nithish = new Scanner(System.in);
    String Name = nithish.nextLine();
    int Age = nithish.nextInt();
    nithish.nextLine();
    String Address = nithish.nextLine();
    System.out.println("My name is " + Name);
    System.out.println("My Age is " + Age);
    System.out.print("My Address is " + Address);
  }
}