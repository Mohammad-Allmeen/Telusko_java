

// class Greet implements Runnable {
//    public void run(){       //the Thread class automatically runs the start() method which runs the run() method therefore you must have run/start method 
//     for (int i = 0; i <100; i++) {
//          System.out.println("Assalamwalaikum");

//          try {
//             Thread.sleep(10); // By this line the schedular applies a break between this thread and the next one and this must be inside the try catch block as it throws Interrupted exception
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     } 
//     }
// }

// class GreetBack implements Runnable
// { // now this becomes the thread class
//   public void run(){
//     for (int i = 0; i < 100; i++) {
//      System.out.println("Walaikumassalam"); 

//      try {
//         Thread.sleep(10);
//     } catch (InterruptedException e) {
//         e.printStackTrace();
//     } 
//     }
//     }
// }
// public class ThreadByRunnable {
//  public static void main(String [] args){

//    // Greet obj= new Greet(); // instead of using the class object you can create the reference of the Runnable object because the Thread class takes 
//     // constrcutor of the Runnable object therefore below line is preferable-

//     Runnable obj= new Greet();  //Reference is of the Runnable interface and object is of the class
//     Runnable obj2 =new GreetBack();

//     Thread t1= new Thread(obj); // you are passing the Runnable object into the Thread constructor as in the Function defination of the Thread
//     Thread t2= new Thread(obj2);

//     obj.run();
//     obj2.run();

//  }   
// }




// Above program using anonymous class and Lambda expression



public class ThreadByRunnable {
 public static void main(String [] args){


// Anonymous class 
// you can do this because Runnable is a functional interface means is has only one method
    Runnable obj= ()->  //Reference is of the Runnable interface with the Anonyous class and Lambda expression 

         { 
     for (int i = 0; i <100; i++) {
          System.out.println("Assalamwalaikum");

          try {
             Thread.sleep(10); // By this line the schedular applies a break between this thread and the next one and this must be inside the try catch block as it throws Interrupted exception
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     } 
    };  

// 2nd anonymous class with Lambda expression

    Runnable obj2 =()->{
   for (int i = 0; i <100; i++) {
          System.out.println("Walaikumassalam");

          try {
             Thread.sleep(10); // By this line the schedular applies a break between this thread and the next one and this must be inside the try catch block as it throws Interrupted exception
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    };

    Thread t1= new Thread(obj); // you are passing the Runnable object into the Thread constructor as in the Function defination of the Thread
    Thread t2= new Thread(obj2);

    obj.run();
    obj2.run();

 }   
}
