// You can create your own customize exception however make sure that it extends the Exception class to get all the attributes of the Exception


class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}

class The {

    //throws keyword is to declare that the method might throw one or more exceptions, transferring the 
    // responsibility of handling it to the calling method. 
    // This acts as a contract, informing callers that they must try-catch block 

    public void throwsKeywordUse() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}

public class CustomExceptionAndThrows {
    public static void main(String[] args) {
      
        int i=20;
        int result=0;

        try{
         result=18/20;
         throw new MyException("Output is Zero");
        }
        catch(MyException e){
            System.out.println(e);
        }

        The obj= new The();

        // the function/method that contains or might contains error will be embedded inside the try/catch block
        try {
             obj.throwsKeywordUse();
        } catch (Exception e) {
          e.printStackTrace(); // this method shoes the heirarchy of the execution of the method which helps to monitor which method contains the error 
        }
       
    }
}
