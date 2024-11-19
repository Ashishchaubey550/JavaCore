class Prinitng implements Runnable{
    public void run(){
        try{
            for(int i=1 ; i<=5; i++){
                System.out.println("Focus Is Important");
                Thread.sleep(3000);
            }
        }catch(Exception e){
            System.out.println("Some problem" + e.getMessage());
        }
    }
}

public class SecondThread {
    public static void main(String[]args){
        System.out.println("Main Thread Startede");
        Prinitng p = new Prinitng();
        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive()); // false 
        t1.start();
        System.out.println(t1.isAlive()); //true
        try{
            t1.join();
        }catch(Exception e){
            System.out.println("Some problem occurs sorry" + e.getMessage());
        }
        System.out.println("Main thread Finished his job like pro");
    }
}
