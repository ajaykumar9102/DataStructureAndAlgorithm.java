package Stage1.Stage2;//time complexity will beO2^n and space complexity O(n)//

import java.util.Scanner;
class Fibo{
    public static int fibo(int n){
        if(n==0 ||n==1){
            return n;
        }else{
            return (fibo(n-1)+fibo(n-2));
        }

    }
}

public class Fibonancci {public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
System.out.println("please enter a number: ");
int n=scan.nextInt();
System.out.println(n+"th term of fibonancci series will be:"+Fibo.fibo(n));
}
    
}
