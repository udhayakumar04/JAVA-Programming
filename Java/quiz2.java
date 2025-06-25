import java.lang.System;
import java.util.Scanner;

class quiz2{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    if(number%2==0)
    {
      System.out.print("The number is even");
    }
    else{
      System.out.print("The number is odd");
    }
  }
}