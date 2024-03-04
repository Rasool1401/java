import java.util.Scanner;
class Random{
    public static int  Even(int n){
        if(n %2==0)
        System.out.print("even number");
        else
        System.out.print("odd number");
        return n;
    }
    
    public static void main(String[] args )
    {
        Scanner scan =new Scanner(System.in);
        


       int  n =Even(89);
        

    }  
}