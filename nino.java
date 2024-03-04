class calculator
{
    int a=10;
    int b=5;

    void add(){
        int c;
        c= a+b;
        System.out.println(c);
    }
}
class calc{
    public static void main(String[] args){
        calculator c = new calculator();
        c.add();

    }
}