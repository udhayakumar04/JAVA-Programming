class forloop2{
  public static void main(String args[]){
    int oddcount = 0;
    for( int i=1;i<=10;i=i+1){
      if(i%2==0){
        //System.out.println("Even number:" + i);
      }
      else{
        oddcount = oddcount+1;
        //System.out.println("Odd number:" + i);
        
      }
    }
    System.out.println(oddcount);
  }
}