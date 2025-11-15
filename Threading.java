class task1 extends Thread{
    public  void run(){
        for(int i=0;i<10;i++){
        System.out.println("task 1  is running");
        }
    }
}
class task2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("task 2 is runnung");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        task1 t1=new task1();
        task2 t2=new task2();
        t1.start();
        t2.start();

    }
}
