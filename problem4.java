import java.util.Scanner;

class problem4{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your Salary: ");
    int salary = scan.nextInt();
    System.out.println("Enter Your Age: ");
    int age = scan.nextInt();

    if(salary>=20000 || age<25){
      System.out.println("Eligible for loan");

      System.out.println("Enter Your Loan Amount: ");
      int loan = scan.nextInt();

      if(loan<50000){
        System.out.print("Loan Available");
      }
      else{
        System.out.print("Loan not available");
      }
    }
    else{
      System.out.print("No loan");
    }
  }
}