import java.util.Scanner;
class  Max{
    public static int Ras(int a[]){
        int max =a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                {
                    max=a[i];
                }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] a=new int[2];
        for(int i=0;i<a.length;i++){
        System.out.print("enter the elements "+i+" : ");
        a[i]=scan.nextInt();
        }
       int max=Ras(a);
       System.out.println(max);
    }
}