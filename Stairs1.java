package Stage1.Stage2;//relation between fibonanacci and stair//

import java.util.Scanner;
class Stair1{
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}

public class Stairs1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the total number of stairs:");
        int n=scan.nextInt();
       System.out.println("total ways to reach "+n+"th stair : "+ Stair1.fibo(n+1)); //for nth stair =fibo(n+1 th term)

        
    }
    
}
