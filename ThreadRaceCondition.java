/*

This program illustrates the two or multiple Thread working on one method or variable 

*/

import javax.sound.sampled.SourceDataLine;

class Counter{
    int count;
    public synchronized void increment(){ // synchronized keyword ensure that only one Thread reached at a time not sumultaneously
        count++;
    }
}


public class ThreadRaceCondition {

    public static void main(String[] args) throws InterruptedException {
   
    Counter c= new Counter();
    Runnable obj=()->{
       for (int i = 0; i < 1000; i++) {
        c.increment();
       }
    };

      Runnable obj2=()->{
       for (int i = 0; i < 1000; i++) {
        c.increment();
       }
    };


    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    //above two Thread should call the method 2000 times and count value should be 2000 
    //however it prints random value 255,226 etc because
    // main function has started the Thread then between the iterations of Two thread main is printed the count it does not waits
    
    t1.join();  // to make the main function wait and let the two thread complete and join still it prints value nearly 2000 as because two thread may reach the count at the same time to overcome this issue you can use keyword synchornized  
    t2.join();

    
System.out.println(c.count);
}
}
