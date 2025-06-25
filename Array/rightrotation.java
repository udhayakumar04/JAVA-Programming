class rightrotation{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int n = arr.length;
    int last = arr[n-1];
    for(int i=1;i<arr.length-1;i++){
      arr[i+1]=arr[i];
    }
    arr[0] = last;
    System.out.println("Right roation in array: ");
    for(int i=1;i<arr.length;i++){
      System.out.println(arr[i]+ " ");
    }
  }
}
//not solved