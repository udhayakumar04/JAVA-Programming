import java.util.Scanner;
class inputarray{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " Elements: ");
    for(int i = 0;i<n;i++){
      arr[i] = scan.nextInt();
    }
    System.out.println("The Elements are: ");
    for(int i=0;i<n;i++){
      System.out.print(arr[i] + " ");
    }
  }
}