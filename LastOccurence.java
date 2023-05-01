package Stage1;

import java.util.Arrays;

public class LastOccurence{
    public static void main(String[] args) {
        int arr[]={2 ,2 ,2 ,6 ,6 ,18, 29 ,30,30,30
            
        };
        Arrays.sort(arr);
        int target=1;
        int result=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                System.out.println("last occurence of this element at index: "+i);
                result=1;
                break;
            }
        }if(result==-1){
            System.out.println("target element is not present");
        }
        
    }
}