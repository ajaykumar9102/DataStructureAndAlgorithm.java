package Stage1;
import java.util.*;
class Octal{
    public static void octal(int n){
        int i=0;
        int arr []=new int [1000];
        while (n!=0){arr[i]=n%8;
            n=n/8;
           i++;

        }int j;
        for( j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        

   }
}

public class DecimalTooctal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enterr a number in the decimal form");
        int n=scan.nextInt();
         Octal.octal(n);
         
        
    }
    
}
