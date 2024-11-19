class Example implements Runnable{
    public void run(){
        for(int i=1; i<=2; i++){
            try {
                System.out.println("Focus is important");
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Thread is interrupted");
            }
        }
    }
}



public class Interrupttt {
    public static void main(String[]args){
        Example E = new Example();
        Thread t1 = new Thread(E);
        t1.start();
        t1.interrupt();
    }
}