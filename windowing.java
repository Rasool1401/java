import java.util.Scanner;
class Random{
    static int Window(int a[],int k){
        int wSum=0;
        int wMax=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wSum +=a[i];
        }
        for(int i=k;i<a.length;i++){
            wSum=wSum-a[i-k]+a[i];
            wMax=Math.max(wSum,wMax);
        }
        return wMax;
    }
   
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[6];
        int k=3;
        for(int i=0;i<a.length;i++){
            System.out.print("enter the arrays : ");
            a[i]=scan.nextInt();   
        }
       System.out.println(Window(a, k));
        
    }
}