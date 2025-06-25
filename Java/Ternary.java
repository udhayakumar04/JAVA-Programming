import java.util.Scanner;

class Ternary{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    String result = num1>num2?"num1 is greater":"num2 is greater";
    System.out.print(result);
   
  }
}