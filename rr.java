import java.util.Scanner;

import util.java.scanner;
class rr{


public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
        int[] a = new int[5];
        int i;
        for(i=0;i< 5;i++){
            System.out.print("enter the age :");
            a[i]=scan.nextInt();
        }
        System.out.println("the ages are :");
        for(i=0;i< 5;i++){
            System.out.println(a[i]);
            
        }
        
}
}