//Exception is the unexpected error that happens during execution of the program 
// It stops the futher execution of the program 
// There we handle using the exception handling concept that if that critical part of the code contains error the further execution continues and does not stops.


public class ExceptionHandling {
    public static void main(String[] args) {
        
        int i=0;
        int result=0;


        int arr[] = new int[5];

        try{
        result= 18/i;
       System.out.println(arr[5]);

    //    if(i==0){
    //     throw new ArithmeticException("The number cannot be divided by Zero");// throw is used to throw the error which goes to the catch block, Arith.. is a class and you can pass the value in the form of constructor
    //    }
        }

        // catch block will be executed only if there is exception in try otherwise the catch block will be skipped
        catch(ArithmeticException e) // here Exception is the class and e is the object that stores the exception 
        {
            System.out.println("Cannot divide by Zero"+e);
        }

       //for every exception you can create specific catch block that handles the specific error

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound error:- "+e);
        }

        //However if you are not sure about the Exception you can use just Exception, it's the super class of all the exception every exception comes under this

        catch(Exception e){
            System.out.println("Error");
        }
        System.out.println("End of the code, Bye");

        /* 

        Exception are basically of two category-

        1. Checked Exception - these exception are compulsory to handle means it should be inside the try catch block. Example- SQLException, IOException
        2. Unchecked Exception- these exception are optional to handle. Example - Arithmetic Exception, ArrayIndexOutOfBound, NullPointerException 

        */

    }
}
