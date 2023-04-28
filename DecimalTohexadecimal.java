package Stage1;
import java.util.*;
class Hexad{
    public static void hexa(int n){
        int i=0;
        int arr []=new int [1000];
        while (n!=0){arr[i]=n%16;
            n=n/16;
           i++;

        }int j;
        for( j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        

   }
}

public class DecimalTohexadecimal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number in the decimal form : ");
        int n=scan.nextInt();
         Hexad.hexa(n);
         
        
    }
    
}
