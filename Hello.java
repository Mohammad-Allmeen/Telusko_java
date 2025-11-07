import java.util.*;

//import- it is a keyword used to bring other java classes and it allows to use the predefined java classes and their functionalities in the program without writing the full name every time
//java is the package name moreover top level package that contains all the core java libraries
// util- it the the subpackage in the java 
// * - it is the wildcard symbol and it imports everything from the specific package

public class Hello{
    public static void main(String [] args){ 

// main- it is the method name and it the entry point where the JVM starts executing
// String - its a class from java.lang package 

        byte b = 122;
        int a= b;
        System.out.println(a); 
        // System- it is a predefined class from java.lang package which provide acces to input, output and error streams
        //out- it is the static object of the printstream class 
        //println- method of Printstream class used for printing in the console and moving the cursor to the next line

        // this is explicit type coversion or casting and there is also process that happens automatically which is implicit
        int c= 125;
        byte d= (byte) c;// this is possible because 125 is within the range of byte 
        System.out.println(d);

        //now what if the value is out of range 

        int x= 258;
        byte y= (byte)x;// as the range of byte is 256 from -127 to +127 so it will divide the value from 256 to store in the byte variable 
        System.out.println(y);

        //short circuit in logical operation && or ||. when && is used with one false and other true statements it does not check the other statement the result will always be false
        // Similarly when || is used with one true and other false statements, it does not check the second statements as the result will always be false.
        // This above concept is called short circuit

    }
}