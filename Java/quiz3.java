class quiz3{
  public static void main(String args[])
  {
    int score = 71;
    
    if(score<50){
      System.out.print("You need to improve");
    }
    else if(score>=50 && score<=70){
      System.out.print("Good job!");
    }
    else if(score>70){
      System.out.print("Excellent performance!");
    }
  }
}