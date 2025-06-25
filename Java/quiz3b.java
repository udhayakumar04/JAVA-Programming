import java.lang.System;
import java.util.Scanner;

class quiz3b{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int subject1 = scan.nextInt();
    int subject2 = scan.nextInt();
    int subject3 = scan.nextInt();
    int subject4 = scan.nextInt();
    int subject5 = scan.nextInt();

    int avg = (subject1+subject2+subject3+subject4+subject5)/5;

    if(avg<35){
      System.out.print("Additional class is required");
    }
    else{
      System.out.print("You are good to go");
    }
  }
}