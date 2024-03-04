import java.util.Scanner;
class max1{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        int max=a[0];
            for(i=0;i<a.length;i++){
                System.out.print("students "+i+" ");
                a[i]=scan.nextInt();
            }
            for(i=0;i<a.length;i++){
                if(a[i]>max)
                {
                    max=a[i];
                }
                
            }
            System.out.print("The max value in a array is "+max);
          
    }
}