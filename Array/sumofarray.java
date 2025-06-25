class sumofarray{
  public static void main(String args[]){
    int[] arr = {5,10,15,20,25};
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];//sum=sum+arr[i]
    }
    double average = sum/arr.length;
    System.out.println("Average  of array elements: " + average);
  }
}