class calculator
{
    int c;
    int add(int a,int b)
    {
        
        c= a+b;
        return c;
    }
}
class calc{
    public static void main(String[] args){
        calculator c = new calculator();
       int num1=20;
       int  num2=30;
        int res=c.add(num1,num2);
        System.ou.println(res);

    }
}