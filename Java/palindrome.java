import java.util.Scanner;
class palindrome{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scan.nextInt();
    int temp = num;
    int reverse = 0;
    while(temp != 0){
      int digit = temp % 10;
      reverse = reverse * 10 + digit;
      temp /= 10;
    }
    if(num == reverse){
      System.out.println(num + " is a palindrome.");
    } else {
      System.out.println(num + " is not a palindrome.");
    }
  }
}