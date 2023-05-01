package Stage1;

import java.util.Scanner;
class Oddoccurence{
    public static int odd(int arr[]){
        int n=arr.length;
        ;
        
        for(int i=0;i<n;i++){ int count=0; 
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                   
                    count++;
                }

            }if(count%2!=0){return arr[i];

        }
       }
   return -1;  }
}

public class Oddoccuring{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n=scan.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.println("enter each element of this array");
            arr[i]=scan.nextInt();
        }int result=Oddoccurence.odd(arr);
        if(result!=-1){
            System.out.println("the elemnt which pressent in array is odd number of times :"+result);
        }
        
    }
}