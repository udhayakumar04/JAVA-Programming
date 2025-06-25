class copyonetoanotherarray{
  public static void main(String args[]){
    int[] orginal ={1,2,3,4,};
    int[] copy = new int[orginal.length];
    for(int i=0; i<orginal.length;i++){
      copy[i] = orginal[i];
    }
    System.out.println("Copied array: ");
    for(int i=0; i<copy.length;i++){
      System.out.print(copy[i]+" ");
    }
  }
}