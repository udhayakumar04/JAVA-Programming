import java.lang.System;
import java.util.Scanner;

class q2{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String Name = scan.nextLine();
    double Score = scan.nextInt();
    scan.nextLine();
    String Department = scan.nextLine();
    System.out.println("My name is " + Name);
    System.out.println("My score is " + Score/10 + "/10");
    System.out.print("My department is " + Department);
  }
}