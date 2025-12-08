// You can create your own customize exception however make sure that it extends the Exception class to get all the attributes of the Exception


class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}

public class CustomException {
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
    }
}
