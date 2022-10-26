class PRINT_THE_DUPLICATE_VALUES_IN_AN_ARRAY{
  public static void main(String[] args){
    int[] ar ={20,50,40,50,34} ;
    for(int i=0;i<=6;i++){
      for(int j=i+1;j<=6;i++){
        if((ar[i] == ar[j]) && (i!=j))
        {
         System.out.println("Duplicate Element is :"+ ar[j]); 
        }
      }
    }
  }
}
