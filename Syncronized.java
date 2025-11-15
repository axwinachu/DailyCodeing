class Data{
    int i=0;
    void increament(){
        i++;
    }
}
public class Syncronized {
    public static void main(String[] args) throws Exception{
        Data d1=new Data();
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0;i<50;i++){
                    System.out.println("thread 1 is working");
                    d1.increament();
                }
               
                
            }
        };
        Runnable r2=()->{
            for(int i=0;i<50;i++){
                System.out.println("thread 2 is working");
                d1.increament();
                
            }
          
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(d1.i);
        

    }
    
}
