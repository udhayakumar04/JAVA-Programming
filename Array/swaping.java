class swaping{
  public static void main(String args[]){
    int[] arr = {10,20,30,40,50};
    int start = 0;
    int end = arr.length-1;
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.println("the swaped Array: ");
    for(int k=0; k<arr.length; k++){
      System.out.print(arr[k]+ " ");
    }
  }
}