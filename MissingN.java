package Stage1;

import java.util.Scanner;
import java.util.function.LongPredicate;
class Miss{
    public static void MissingNum(long arr [],int x){
        int n=arr.length;
        int sum =x*(x+1)/2;
        long sum1=0;
        for(long l:arr){
            sum1 +=l;

        }System.out.println(" the missing element is :"+(sum-sum1));
    }
}

public class MissingN {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
        long arr[]=new long [n];
      
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }System.out.println("enter the last number which we want");
        int x=scan.nextInt();
        Miss ms=new Miss();
        ms.MissingNum(arr, x);

        
    }
    
}
