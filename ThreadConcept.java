// Thread is smallest unit of the execution of the program 
// Whenever you use thread it must have run() or start(), because from here the execution of the thread begins
// Every classd in thread must extend the Thread class or Runnable interface 


class Greet extends Thread {
   public void run(){       //the Thread class automatically runs the start() method which runs the run() method therefore you must have run/start method 
    for (int i = 0; i <100; i++) {
         System.out.println("Assalamwalaikum");

         try {
            Thread.sleep(10); // By this line the schedular applies a break between this thread and the next one and this must be inside the try catch block as it throws Interrupted exception
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } 
    }
}

class GreetBack extends Thread{ // now this becomes the thread class
  public void run(){
    for (int i = 0; i < 100; i++) {
     System.out.println("Walaikumassalam"); 

     try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        e.printStackTrace();
    } 
     
    }
    }
}
public class ThreadConcept {
 public static void main(String [] args){

    Greet obj= new Greet();

    GreetBack obj2= new GreetBack();

    //schedular organises and sets the priority for the thread and you can assign the priority for any specific thread

    obj.setPriority(10); //1 is the least and 10 is the max priority

    obj2.setPriority(Thread.MAX_PRIORITY); //second way for assigning the priority

    obj.start();
    obj2.start();

 }   
}
