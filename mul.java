import java.util.Scanner;
class r2
{
    public static void main(String[] args)
    {
	Scanner scan=new Scanner(System.in);
	
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	int sum1 = a + b ;
	int sum2 = a + c ;
	int sum3 = c + b ;
	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(sum3);
   
	 }
}