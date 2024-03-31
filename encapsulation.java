import java.util.Set;

class Student{
    private int age;
    private String Name;
    private int Roll;

    public void setData(int age, String Name,int Roll){
        this.age=age; //to match the set convenction
        this.Name=Name; // this is given to instance variables
        this.Roll=Roll;
    }
    public int getage(){
        return age;
    }
    public String getName(){ //different because the return type cant be synchron0us
        return Name;
    }
    public int getRoll(){
        return Roll;
    }


}
class encapsulation {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setData(16,"rasool",868821);
        System.out.println(s1.getage());
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());

    }
    
}
