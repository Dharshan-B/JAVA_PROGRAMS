import java.util.Scanner;
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int ar[] ={45,25,85,74,96,36};
     int newarr[] = new int[7];
     int index;
     int value;
         System.out.println("enter the index");
         index = in.nextInt();
         System.out.println("enter the value");
         value = in.nextInt();
         System.out.println("Before insertion:"+Arrays.toString(ar));
         for(int i=0,j=0;i<newarr.length;i++)
         {
             if(index!=i)
             {
                 newarr[i]=ar[j];
                 j++;
             }
             else
             newarr[i]=value;
         }
         System.out.println("After Insertion :"+Arrays.toString(newarr));
    }
}
