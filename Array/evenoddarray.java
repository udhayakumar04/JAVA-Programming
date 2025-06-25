class evenoddarray{
  public static  void main(String args[]){
    int[] arr = {11,22,33,44,55,66};
    int evencount=0, oddcount=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        evencount++;
      }else{
        oddcount++;
      }
    }
    System.out.println("Even number count: " + evencount);
    System.out.println("Odd number count: " + oddcount);
  }
}