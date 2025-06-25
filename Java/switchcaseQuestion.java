import java.util.Scanner;
class switchcaseQuestion{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int units = scan.nextInt();
    float bill = 0.0f;
    if(units<=50){
      bill = units*0.50f;

    }else if(units<=150){
      bill = 50*0.50f +(units - 50)*0.75f;

    }else if(units<=250){
      bill = 50*0.50f + 100*0.75f + (units - 150)*1.20f;

    }else{
      bill = 50*0.50f + 100*0.75f + 100*1.20f + (units-250)*1.50f;
    }
    bill += bill+0.20f;

    System.out.printf("Total Electricity bill: Rs.%.2f\n",bill);

    }
  }
