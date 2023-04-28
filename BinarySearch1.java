package Stage1;
import java.util.*;//t.c==O(logn) ands.c==O(1)//
class BinaryS1{
    public static int Bin(int arr[], int x){
        int low=0;
        int high=arr.length-1;
        int result=-1;
       
        for(int i=0;i<arr.length;i++){ int mid=low+(high-low)/2;
            if(arr[mid]==x){
                result=mid;
                high=mid-1;//only here changed//
                
            }else if(arr[mid]<x){
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
   return result; }

    
}


public class BinarySearch1 {
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
       
       BinaryS1 bs=new BinaryS1();
      
      
       int result= bs.Bin(arr,x);
       if(result!=-1){ System.out.print("target elemnt found at index : "+result+" ");
      
       }else{ System.out.println("target elemnt not present in this array");
       
       } 

        
        
    }
    
}
