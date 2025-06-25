import java.util.Scanner;
class uk{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int month = scan.nextInt();
    switch(month){
      case 1:
        System.out.println("Jan has 31 days");
        break;
      case 2:
        System.out.println("Feb has 28 days");
        break;
      case 3:
        System.out.println("March has 31 days");
        break;
      case 4:
        System.out.println("April has 30 days");
        break;
      case 5:
        System.out.println("May has 31 days");
        break;
      case 6:
        System.out.println("June has 30 days");
        break;
      case 7:
        System.out.println("July has 31 days");
        break;
      case 8:
        System.out.println("Aug has 31 days");
        break;
      case 9:
        System.out.println("Sep has 30 days");
        break;
      case 10:
        System.out.println("Oct has 31 days");
        break;
      case 11:
        System.out.println("Nov has 30 days");
        break;
      case 12:
        System.out.println("Dec has 31 days");
        break;
      
    }
  }
}