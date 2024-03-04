class calculator
{
    int c;
    void add(int a,int b)
    {
        
        c= a+b;
        System.out.println(c);
    }
}
class calc{
    public static void main(String[] args){
        calculator c = new calculator();
       int num1=20;
       int  num2=30;
        c.add(num1,num2);

    }
}