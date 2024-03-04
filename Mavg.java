import java.util.Scanner;
class Avg{
    public static int Maxtern(int a[]){
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum +=a[i];
            
        }
        return sum/2;
    }
    public static void main(String[] args)
    {
        int[] a= new int[3];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.print("array "+i+" ");
            a[i]=scan.nextInt();
        }
        int sum=Maxtern(a);
        System.out.println("the average of arrays is "+sum);
    }
}