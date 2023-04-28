package Stage1;
import java.util.*;//here code is longer//
class Math1{
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
class Decimal1{
    public static int  decimal(int n){
        
        int i=0;int octal=0;
        while(n!=0){int r=n%10;
        n=n/10;
           octal  +=r*(Math1.pow(8,i));
           i++;


        }//System.out.println(decimall);
  return octal;  }
}


public class OctalTodecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number in the form of octal : ");
      int n=scan.nextInt();
      System.out.println(Decimal1.decimal(n));
        
        
    }
    
}
