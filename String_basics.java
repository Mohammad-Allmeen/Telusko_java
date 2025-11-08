public class String_basics {
   public static void main(String[] args){

    // String is a class that contains different method and also String is constant that does not and is immutable therefore for the changes and modification we use String Buffere

    String name = new String("Allmeen"); // through the constructor the value is stored
   
    name = "Mohammad "+name; // as String is immutable unchanged so when Mohammad is added it does not changes the String infact it creates a new object in the heap that stores Mohammad Allmeen a
    // and links the name which is stored in the stack to that object. now the previous object that consist of Allmeen is now eligible for garbage collector 
    System.out.println(name);

    String s1= "ALLMEEN";
    String s2= "ALLMEEN";

    //here s1 and s2 are stored in the stack and they are linked to the address of the object store in the heap inside the String constant pool(SCP)
    // as s1 is already linked to the object in the SCP it check whethere there is a same name "ALLMEEN" if yes it reference and assigns the same object address of s1 to also s2

   } 
}
