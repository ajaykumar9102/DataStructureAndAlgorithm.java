package Stage1;
import java.util.*;
class Square{
    public static int Root(int n){
        int low=0;
        int high=n;
        for(int i=0;i<=n;i++){
            int mid=low+(high-low)/2;
           int  value=mid*mid;
           if(n==value){
            return mid;
           }else if(n>value){
            low=mid+1;
           }else{
            high=mid+1;
           }
        }
   return -1; }
}

public class Squareroot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number which you want to find square root");
        int n=scan.nextInt();
        Square sq=new Square();
      int result=  sq.Root(n);
      if(result !=-1){
        System.out.println("the square root of this number is : "+ result);
      }else{
        System.out.println(" sorry we can't find ");
      }

        
    }
    
}
