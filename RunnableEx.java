class Task1 implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("task 1 is working");
        }

    }
}



public class RunnableEx {
    public static void main(String[] args) {
        Runnable r1 = new Task1();
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = ()->{
            for(int i=0;i<50;i++){
            System.out.println("task 2 is working");
            }
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
