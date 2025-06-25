import java.lang.System;
import java.util.Scanner;

class ifelseExercise{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String meghana = scan.nextLine();

    if(meghana.equals("death")){
      System.out.println("Suriya meets Ramya");
    }
    else{
      System.out.println("Suriya meets meghana");
    }
  }
}