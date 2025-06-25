import java.util.Scanner;

class pratice{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    long fact = 1;
    for(int i=1;i<=num;i++){
      fact*=i;
    }
    System.out.println("Factorial of " + num + " is: " + fact);
  }
}