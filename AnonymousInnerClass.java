


class Anonymous {
    int age;

    public void methodA() {
        System.out.println("In method of A");
    }
}


public class AnonymousInnerClass {

    public static void main(String[] args) {
        Anonymous obj = new Anonymous(){ // inside this you can define the method or variable this will act as the Anonymous inner class, and the method will be accesed using this object obj

        public void methodA(){ // method name in the super class should be similar as in this Anonymous class
           System.out.println("Concept of Anonymous class");
        }
        };

        obj.methodA();
    }
}





