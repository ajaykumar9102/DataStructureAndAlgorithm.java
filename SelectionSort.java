package Stage1;//t.cO(n*n) and  s.c O(1) and same as insertion sort//
import java.util.*;
class Selection{
    public static void selection(int arr[]){
        int n=arr.length;
        int min_idx;
        for(int i=0;i<n;i++){min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    int temp=arr[j];
                    arr[j]=arr[min_idx];
                    arr[min_idx]=temp;
                    min_idx=j;
                }
            }

        }System.out.println("after sorting of an array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n=scan.nextInt();
        int arr []=new int [n];
        for(int i=0;i<n;i++){System.out.println("please enter each  elemnt of this array");
      arr[i]=scan.nextInt();
        }
        Selection.selection(arr);
        
    }
    
}
