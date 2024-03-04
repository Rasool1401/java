import java.util.Scanner;
class adder{
     static void adding (int[] ar){
        int sum =0;
        for(int i=0;i<ar.length;i++)
        {
            sum +=ar[i];
        
        }
        
        


    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] ar=new int[3];
        int sum=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("enter the arrays :");
            ar[i]=scan.nextInt();
        }
        adding (ar);
        for(int i=0;i<ar.length;i++){
            
            System.out.print(sum+" ");
            
        }
    }
}