
// The values stored in the enum act as constants

enum Status{
    Running, Process, Failed, Pending, Success
}

public class Enum {
   public static void main(String[] args){

     Status s= Status.Failed;

     System.out.println(s.getClass().getSuperclass());

     System.out.println(s);

     Status arr[]= Status.values(); //the values stored in the array

     for (Status l: arr){
        System.out.println(l +" : "+ l.ordinal());  // ordinal will print the position of the values
     }

    if(s== Status.Failed){
        System.out.println("Process Failed");
    } else if(s== Status.Pending){
        System.out.println("Process Pending");
    } else if(s== Status.Running){
        System.out.println("Process Running");
    } else {
        System.out.println("Process Success ");
    }

switch(s){

    case Running:
        System.out.println("Running Status");
        break;
     case Failed:
        System.out.println("Process Failed");   
        break;
     default:
        System.out.println("No status");   

}
   } 
}
