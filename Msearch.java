import java.util.Scanner;
class Sea{
    public static int search(int[] a,int n)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            return i;
            
        }
        return -1;
     
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,9};
        
        System.out.print("number to be searched : ");
        int n=scan.nextInt();
        int i=search(a,n);
        if(i!=-1)
        System.out.println("the index value is found"+i);
        else
        System.out.println("not found");
        
    }
}