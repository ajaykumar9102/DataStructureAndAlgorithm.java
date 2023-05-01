package Stage1;
import java.util.Scanner;

class Setb{
        public static int setbit(int n){
            int i=0;
            int count=0;
            int arr[]=new int [n];
            while(n!=0){
                arr[i]=n%2;
                n=n/2;
                i++;
            }for(int j=i-1;j>=0;j--){
                if(arr[j]==1){
                    count++;
                }
            }
            
      return count;  }
    }
public class SetBits{
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number which you want: ");
        int n=scan.nextInt();
       System.out.println(Setb.setbit(n)); 
        
    }
}
