class maxminarray{
  public static void main(String args[]){
    int[] arr= {12,15,11,18,10,20};
    int max=arr[0];
    for(int i=1;i<arr.length;i++){ 
      if(arr[i] >max){   //change the symbol for minimum(arr[i] < max)
        max = arr[i];
      }
    }
    System.out.println("Larger number is: " + max);
  }
}