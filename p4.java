class p4{
    public static void main(String[] args){
        int i;
        int j;
        int n=5;
    int k;
    for(i=1;i<=n;i++){
                for(k=1;k<=n-i;k++){
                System.out.print(" ");
                }
    for(j=1;j<=i;j++){
    if(i==1 || i==n || j==1 || j==i)
    System.out.print("*");
    else
    System.out.print(" ");
    
    }
    System.out.println(" ");
    }
    
    }
    }