//package Stage1;

import java.util.Scanner;

public class FilterVCCH {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a sentence which you want : ");
        
        String str=scan.nextLine();
        str=str.replace(" ","");
       str= str.toLowerCase();
       int vcount=0;
       int ccount=0;
       int chcount=0;
       String V=new String();
       String C=new String();
       String CH=new String();
       
       
       String character=new String();


        for(int i=0;i<str.length();i++){  
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='0'||str.charAt(i)=='u'){
                vcount++;
                 V=V+str.charAt(i);

            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                ccount++;
                C=C+str.charAt(i);
            }else{
                chcount++;
                CH=CH+str.charAt(i);
            }
       

    } System.out.println("******************************");
        System.out.println("total vowel in this sentence : "+vcount+ " which are:  "+V);
        System.out.println("total consonant in this sentence : "+ccount+ " which are:  "+C); 
        System.out.println("total character  in this sentence : "+chcount+ " which are:  "+CH);}
    
}
