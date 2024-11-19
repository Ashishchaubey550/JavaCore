import java.util.Scanner;


class Cal extends Thread{
    public void run(){
        System.out.println("Calculation Task is Started");
        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num1 = number.nextInt();
        System.out.println("PLease enter second number");
        int num2 = number.nextInt();
        int res = num1+num2;
        System.out.println(res);
        System.out.println("Calculation task is completed");
    }
}

class Message extends Thread{
    public void run(){
        System.out.println("Printing important message");
        try{
            for(int i=0; i <=3 ; i++){
                System.out.println("Trust the next chapter because you are the author");
    
                Thread.sleep(2000);
            }  
        }catch(Exception e){
            System.out.println("Some Problems");
        }
        System.out.println("Important task is completed");
    }
}

class Threadss{
    public static void main(String[]args){
        System.out.println("Main Thread started");
        Cal t1 = new Cal();
        t1.start();
        try {
            t1.join();

        } catch (Exception e) {
            System.out.println("Some problem Occurs Sorry");
        }
        Message t2 = new Message();
        t2.start();
    }
}


// ===============================Example Questions=============================
// class OddNumber extends Thread{
//     private int n;
//     public void run(){
//         for(int i = 1 ; i <=n; i++){
//             if (i%2!=0) {
//                 System.out.println("Odd " + i);
//             }
//         }        
//     }
//     OddNumber(int n){
//         this.n = n;
//     }
// }
// class EvenNumber extends Thread{
//     private int n;
//     public void run(){
//         for(int i=1;i<=n;i++){
//             if (i%2==0) {
//                 System.out.println("Even " + i);
//             }
//         }
//     }
//     EvenNumber(int n){
//         this.n = n;
//     }
// }
// class Threadss{
//     public static void main(String[]args){
//         Scanner ODD = new Scanner(System.in);
//         System.out.println("Enter A number to check is odd or even");
//         int n = ODD.nextInt();
//         OddNumber t1 = new OddNumber(n);
//         EvenNumber t2 = new EvenNumber(n);
//         t1.start();
//         t2.start();
//         ODD.close();
//     }
// }


// class MyThreads extends Thread{
//     public void run(){
//         String tname = Thread.currentThread().getName();
//         if(tname=="Ashish"){
//             message1();
//         }else{
//             messgae2();
//         }
//     }
//     public void message1(){
//         try{
//             System.out.println("Message 1");
//             Thread.sleep(10000);
//         }catch(Exception e){
//             System.out.println("Facing some Problem" + e.getMessage());
//         }
//     }
//     public void messgae2(){
//         try{
//             System.out.println("Message2");
//             Thread.sleep(6000);
//         }catch(Exception e){
//             System.out.println("Facing some Problem" + e.getMessage());
//         }
//     }
// }

// class Threadss{
//     public static void main(String[]args) throws Exception{
//         MyThreads Thread1 = new MyThreads();
//         MyThreads Thread2 = new MyThreads();
//         Thread1.setName("Ashish");
//         Thread2.setName("Chaubey");
//         Thread1.start();
//         Thread2.start();

//     }
// }