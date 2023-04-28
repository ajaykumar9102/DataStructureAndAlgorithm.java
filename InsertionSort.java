package Stage1;//time complexity isO(n*n) and s.c O(1)//
  //by using this concept we get first  smallest elemnt  2nd smallest as so on this based 
  //iteration that how much we iterate the loop//
import java.util.Scanner;//best case senario is ascendingorder in this case only coprision not swapping 
//so time complexity is O(n)
class Insert{
    public static int insert(int arr[]){
        int result=-1;
        int n=arr.length;
        for(int i=1;i<n;i++){
            for (int j=i;j<n;j++){
                if(j>0 &&arr[j]<arr[j-i]){
                    int temp=arr[j];
                    arr[j]=arr[j-i];
                    arr[j-i]=temp;
                    result=1;
                }
            }
        }System.out.println("after sorting of an array is: ");
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        

   return result; }
}

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=scan.nextInt();
     int  arr[]=new int  [n];
        for(int i=0;i<n;i++){
            System.out.println("enter element in this array");
            arr[i]=scan.nextInt();
        }Insert  bs=new Insert();
        bs.insert(arr);
      
       // System.out.println( ));
        

        
    }
    
}
