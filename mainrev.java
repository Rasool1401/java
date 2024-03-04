import java.util.Scanner;
class ReverseArray { 
static void reverse (int[] ar){
    int i=0,j=ar.length-1; 
    while(i<j){
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
        i++;
        j--;
    }
}
public static void main(String[] args) {
    //int[] ar={1,2,3,4,5,6,7,8,9,0};
    Scanner scan=new Scanner(System.in);
    int ar[]=new int[3];
    for(int i=0;i<ar.length;i++){
        //System.out.print("enter the array "+i);
       ar[i]=scan.nextInt();
    }
    System.out.print("");
    reverse(ar);
    
    for(int i=0;i<ar.length;i++){
        System.out.print(ar[i]+" ");
    }
}
}