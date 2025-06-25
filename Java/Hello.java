import java.lang.System;
import java.util.Scanner;

class hello{
  public static void main(String args[]){
    Scanner nithish = new Scanner(System.in);

    int mark = nithish.nextInt();
    nithish.nextLine();

    String subject = nithish.nextLine();
    System.out.println("Your mark is " + mark);
    System.out.print("The subject " + subject);
  }
}