package Stage1.Stage2;

import java.util.Scanner;
class Stair{
    public static int stair(int n){
        if(n==1||n==2){
            return n;
        }else{
            return stair(n-1)+stair(n-2);
        }

    }
}

public class Stairs {public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("please enter the number of stairs whhich you want to ride: ");
    int n=scan.nextInt();
    System.out.println("total ways to reach "+n +"th stair: "+Stair.stair(n));
}
    
}
