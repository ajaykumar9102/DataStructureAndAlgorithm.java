package Stage1.Stage2;//time complexity will be O(n) and space complexity will beO(n)//

import java.util.Scanner;
class Facto{
    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}

public class Factorial {public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number :");
    int n=scan.nextInt();
 System.out.println( Facto.fact(n));  
}
    
}
