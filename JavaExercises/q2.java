import java.util.Scanner;

class q2{
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Multiplication table number");
    int table = scan.nextInt();

    for(int i=1;i<=10;i++){
      System.out.println(i + " x " + table + " = " + table*i);
    }
  }
}