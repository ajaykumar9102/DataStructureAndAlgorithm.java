package Stage1;//t.c==O(n) and s.c==O(1)//

import java.util.Scanner;
class Linear{

    public static int lin(int arr[],int x){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }

   return -1; }
}

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
     int  arr[]=new int  [n];
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }System.out.println("enter the target element which we want to find");
        int x=scan.nextInt();
        Linear l=new Linear();
       int result= l.lin(arr, x);
       if(result!=-1){ System.out.print("target elemnt found at index : "+result+" ");
      
       }else{ System.out.println("target elemnt not present in this array");
       
       } 
    }
    
}
