package Stage1.Stage2;//time complexity will be O(logn)and base complexity? //
//Divide and conquer rule this is the optimized approach//
import java.util.Scanner;
class Power{
    public static int power(int x,int y){
        int result=0;
        if(y==1){
            return x;
        }else{
            result= power(x,y/2)*power(x,y/2);
        }if(y%2==1){
            result= 2*result;
        }
   return result;     }


    }


public class PowerR {public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("please enter a number: ");
    int base =scan.nextInt();
    System.out.println("please enter second number: ");
    int power=scan.nextInt();
   System.out.println(Power.power(base,power)); 

}
    
}
