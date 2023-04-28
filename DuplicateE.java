package Stage1;

import java.util.Scanner;
class Dup{
    public static int  Duplicate(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                   
                    return arr[i];

                }
            }
        }return -1;
    }}
        

    


public class DuplicateE {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
        int arr[]=new int [n];
      
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }
        int result=Dup.Duplicate(arr);
        if(result==-1){
            System.out.println("duplicate is not present in this array");
        }else{
            System.out.println("the duplicate element is : "+result+" ");
        }

        
    }}
    

