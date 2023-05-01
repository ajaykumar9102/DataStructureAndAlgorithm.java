package Stage1;

import java.util.Scanner;

class Powercheck{

 public static void power (int base,int num){
    int  result=1;
    boolean flag=false;
    for(int i=1;i<=num;i++){
        if(result==num){
            result=1;
            flag=true;
            System.out.println("yes "+base+ " to the power: "+0);
        }else {result=result*base;
            if(result==num){
                System.out.println("yes "+base+ " to the power: "+i);
                flag=true;
                break;

            }

        }
    }if(flag==false){
        System.out.println("not exist");
    }

 }  }

public class PowerOf2 {public static void main(String[] args) {
   // Scanner scan=new Scanner(System.in);
   // System.out.println("enter base :");
    //int base=scan.nextInt();
    //System.out.println("enter a number:");
    //int num=scan.nextInt();
    int num=15;
    int base=2;
    Powercheck.power(base,num);
    

    
    }

    
}
