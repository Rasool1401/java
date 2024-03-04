import java.util.Scanner;
class even{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("enter the number :");
        int n=scan.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        
        else
        System.out.println("odd number");
    }
}