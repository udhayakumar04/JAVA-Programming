class sortingloop{
  public static void main(String args[]){
    int[] arr= {3,6,2,5,1};
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println("Array in ascending order: ");
    for(int k=0;k<arr.length;k++){
      System.out.print(arr[k] + " ");
    }
  }
}