import java.util.Scanner;
class raa{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
       int[][] a=new int [2][3];
       int i,j;
       for(i=0;i<a.length;i++)
       {
        for(j=0;j<a[i].length;j++)
        {
            System.out.print("class "+i +" students "+j );
            a[i][j]=scan.nextInt();
        }
        System.out.println();
        }
        for(i=0;i<a.length;i++)
       {
        for(j=0;j<a[i].length;j++)
        {
            System.out.print(a[i][j]+" ");
            
        }
        System.out.println();
        }
       }
    }
