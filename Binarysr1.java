package Stage1;
import java.util.*;
class Binary{
    public int binarySearch(int arr[],int x){
        int low=0;
        int high=arr.length-1;
       
       
        for(int i=0;i<arr.length;i++){ int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
               
            }else if(arr[mid+1]>arr[mid]){
                low=mid+1;
                
              
                
            }else{
                high=mid-1;
                 mid=low+(high-low)/2;
                return mid;
                
                
            }

        }
        
         
       return -1;
    }
}

public class Binarysr1 {
    public static void main(String[] args) { Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){System.out.println("enter   each element of this array");
       arr[i] =scan.nextInt();
        

        }System.out.println("enetr target elemnt");
        int num=scan.nextInt();
          Binary bn=new Binary();


       
     int result =bn.binarySearch(arr, num); 
     if(result==-1){
        System.out.println("the elemnt is not present");
     }else{
        System.out.println("the elemnt is present at index : "+result);
     }
    }
    
}
