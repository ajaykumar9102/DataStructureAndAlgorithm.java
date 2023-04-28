package Stage1;

import java.util.*;
class Swap{
    public static void  Swap(long[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int mid=low+(high-low)/2;
        for(int i=0;i<mid;i++){
            Long temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
           
        }System.out.println("After swapping of element of this array is :");
        for(int i=0;i<n;i++){
            
           
             System.out.print(arr[i]+" ");
        }
    }
}

public class ReversingA {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
        long arr[]=new long [n];
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }System.out.println("**************************");
        Swap sw=new Swap();
        sw.Swap(arr);
        
    }
    
}
