package Stage1;
import java.util.*;//here code is longer//
class Math{
    public static int pow(int x,int y){
        int result=1;
        for(int i=1;i<=y;i++){
            if(y<0){
                result=1;
            }else{
                 result=result*x;
            }
            
        }
   return result; }
}
class Decimal{
    public static int  decimal(int n){
        
        int i=0;int decimall=0;
        while(n!=0){int r=n%10;
        n=n/10;
           decimall  +=r*(Math.pow(2,i));
           i++;


        }//System.out.println(decimall);
  return decimall;  }
}

public class BinarToDecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number in the form of binary : ");
      int n=scan.nextInt();
      System.out.println(Decimal.decimal(n));
        
    }
    
}
