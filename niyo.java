class calculator
{
    int a=10;
    int b=5;

    int add(){
        int c;
        c= a+b;
        return c;
    }
}
class calc{
    public static void main(String[] args){
        calculator c = new calculator();
        int rev=c.add();
        System.out.println(rev);

    }
}