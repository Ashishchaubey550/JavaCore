class Car implements Runnable{
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + "Has Entered The Parking lot ");
            Thread.sleep(2000);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() + "Got into Car to Drive ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Started to drive the car ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Come back and parked the car ");
            }
        } catch (Exception e) {
            System.out.println("Problem Occurs ");
        }
    }
}

public class Sync2{
    public static void main(String[]args){
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("Ashish ");
        t2.setName("Prabhat ");
        t3.setName("Abhishek ");
        t1.start();
        t2.start();
        t3.start();

    }
}
