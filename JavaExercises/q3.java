import java.util.Scanner;

class q3{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] marks = new int[size];

    for(int i=0;i<=size-1;i=i+1){
      marks[i] = scan.nextInt();
    }
  }
}