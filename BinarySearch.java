package Stage1;//.c=O(logn) and S.c==O(1)//

import java.util.Arrays;
import java.util.Scanner;
class BinaryS{
    public static int Bin(int arr[], int x){
        int low=0;
        int high=arr.length-1;
       
        for(int i=0;i<arr.length;i++){ int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
   return -1; }

    
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
     int  arr[]=new int  [n];
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }Arrays.sort(arr);
        System.out.println("enter the target element which we want to find");
        int x=scan.nextInt(); 
       
       BinaryS bs=new BinaryS();
      
      
       int result= bs.Bin(arr,x);
       if(result!=-1){ System.out.print("target elemnt found at index : "+result+" ");
      
       }else{ System.out.println("target elemnt not present in this array");
       
       } 

        
    }
    
}
