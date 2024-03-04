import java.util.Scanner;
class sumarray{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        int sum=0;
            for(i=0;i<a.length;i++){
                System.out.print("students "+i+" ");
                a[i]=scan.nextInt();
            }
            for(i=0;i<a.length;i++)
            {
                sum +=a[i];
                
            }
            System.out.print("The sum of elements in array "+sum);
          
    }
}