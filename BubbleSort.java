package Stage1;//t.c O(n*n) and s,cO(1) and by using this concept we get largest element//
import java.util.*;
class BubbleS{
    public static int bubble(int arr[]){
        int result=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    result =1;
                }
            }
        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
   return result; }
}

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
     int  arr[]=new int  [n];
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }BubbleS bs=new BubbleS();
        bs.bubble(arr);
      
       // System.out.println( ));
        
    }
}
  