import java.util.Scanner;
class cll{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
      int[] a =new int[2];
       int i;
       for(i=0;i<a.length;i++){
        System.out.print("students"+i);
        a[i]=scan.nextInt();
       }
       if(a[i]>0)
       System.out.println("maximum variables"+i);
       else 
       System.out.println("minimum variables"+i);
    }
}