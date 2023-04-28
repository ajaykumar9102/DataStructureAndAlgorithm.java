package Stage1;
import java.util.*;//shortest version previous//
//t.c=O(n);
class Dec{
    public static int dcm(int n){
        int decimal=0;int base=1;
        while(n!=0){
            int r=n%10;
             n=n/10;
             decimal+=r*base;
             base=base*2;
        }

  return decimal;  }
}

public class BinaryTodecimal1 {public static void main(String[] args) {
    

    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number in the form of binary : ");
  int n=scan.nextInt();
  System.out.println(Dec.dcm(n));
    
}}
