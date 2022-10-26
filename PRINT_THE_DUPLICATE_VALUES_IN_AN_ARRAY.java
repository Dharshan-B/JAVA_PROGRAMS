class PRINT_THE_DUPLICATE_VALUES_IN_AN_ARRAY{
  public static void main(String[] args){
    int[] ar ={20,50,50,30,40,40,50,34} 
    for(int i=0;i<ar.lenght-1;i++){
      for(int j=i+1;j<ar.lenght-1;i++){
        if((ar[i] == ar[j]) && (i!=j))
        {
         System.out.println("Duplicate Element is :"+ ar[j]); 
        }
      }
    }
  }
}
