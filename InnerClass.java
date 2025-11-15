
class A{
    int a=10;
    void display(){
        System.out.println("hello im aswin");
    }
    static class B{
        void InnerClass(){
            System.out.println("configuration for the innerClass");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.display();
        A.B obj2=new A.B();
        obj2.InnerClass();
        
    }
}
