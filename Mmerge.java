import java.util.Scanner;
class Www{
    static main  Merge(int[][] a){
        int[] t=a.length+a[i].length;
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[][] a=new int[2][4];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print("array"+i+" num"+j+" ");
                a[i][j]=scan.nextInt();
            }
            System.out.println("");
        }
        

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                
            }
            System.out.println();
        }
        a=merge(a);
        
         
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
                
            }
            System.out.println();
        }      
    }
}