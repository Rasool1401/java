import java.util.Scanner;
class Ocean{
    public static boolean isPalindrome(int[] a)
    {
        int i =0;
        int j =a.length-1;
        while(i<j){
        if (a[i] != a[j]) {
            return false; // Early return on mismatch
        }
        i++;
        j--;
    }

    return true; // Match if loop completes without returning false
}
     
        

    public static void main(String[] args)
    {
        //int[] a={1,2,2,1,9,0};
        Scanner scan=new Scanner(System.in);
        int[] a= new int[3];
        for(int i=0;i<a.length;i++){
            System.out.print("array : ");
            a[i]=scan.nextInt();
        }
        if(isPalindrome(a)){
            System.out.println("the array is a palindrome");
        }
        else
        System.out.println("the array is a not palindrome"); 
    }
}
