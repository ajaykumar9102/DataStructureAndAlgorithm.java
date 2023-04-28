package Stage1;
import java.util.*;
//time complexity is O(n)
//space complexity is O(1)//

public class SunOfN{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter anumber");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum +=i;

        }
  System.out.print("the sum of first "+ n+"-natural number is: "+sum+" ");
  System.out.println("************************************************************");
  //time complexity is O(1)//
//space complexity is O(1)//

  System.out.println("enter a number");
  int m=scan.nextInt();
  int sum1=(m*(m+1))/2;
  System.out.println("the sum of first "+m+"-natural number is: "+sum1+" ");
        
    }
}