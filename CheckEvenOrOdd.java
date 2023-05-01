package Stage1;
class Evencheck{
    public static void check(int num){
        if(num%2==0){
            System.out.println("the number "+num+" is an even number");
        }else{
            System.out.println("the number "+num+" is an  odd number");   
        }
    }
}

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num=8;
        Evencheck.check(num);
        
    }
    
}
