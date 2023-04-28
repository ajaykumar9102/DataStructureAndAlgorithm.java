package Stage1;
import java.util.*;
class Binaryy{
    public static void palindromee (int arr[]){
        int low=0;
        int n=arr.length;
        int high=arr.length-1;
        int mid=low+(high-low)/2;
        boolean flag=false;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                flag=true;
                System.out.println("this is not palindrome");
                break;
            }




    }if(flag==false){System.out.println("this is the palindrome");
            };
                


    }
}

public class ArrayPalin {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
                System.out.println("enter the size of an array");
                int n=scan.nextInt();
                int arr[]=new int [n];
                for(int i=0;i<n;i++){System.out.println("enter each element of this array");
               arr[i] =scan.nextInt();
                
        
                }Binaryy bn=new Binaryy();
        
               
             bn.palindromee(arr); 
             
             }
            }
            
        
        

        
    
    

