package Stage1;//time complexity is O(m*n);
               //space complexity is O(1)//

import java.util.Scanner;
class Rotation{
    public static void RotationP(int arr[][]){
        int m=arr.length;
        int l=arr[0].length;
        for(int i=0;i<m;i++){  //here we use concept of transpose of the matrix//
            for(int j=i;j<l;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){  //here we use Swapping //
            for(int j=0;j<l/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][l-j-1];
                arr[i][l-j-1]=temp;
            }
        }
       System.out.println("after raotaion matrix at 90 degree:  ");
        for(int i=0;i<m;i++){for(  int j=0;j<m;j++){
            
                       System.out.print(arr[i][j]+" ");
                        
                    }System.out.println();

    }
}}

public class RotationP {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){for(  int j=0;j<n;j++){

           System.out.print("enter each element of this array: ");
            arr[i][j]=scan.nextInt();
        }System.out.println();
           

        }Rotation t=new Rotation();
        t.RotationP(arr);
        
    }}
    

