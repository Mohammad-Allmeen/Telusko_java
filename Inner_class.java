
class A {
    int age;

    public void methodA() {
        System.out.println("In method of A");
    }

    class B {
        public void methodB() {
            System.out.println("In method of B ");
        }
    }
}

public class Inner_class {

    public static void main(String[] args) {
        A obj = new A();
        obj.methodA();

        // As the class B is inside the class A therefore B is like the method of class
        // A which will be accessed with the object
        // if you want to access the class B, you will have to access it through the
        // object of class A

        A.B obj1 = obj.new B(); // this is how you will access the inner class

        // A.B obj1= new A.B(); // this is the process when the inner class is static as
        // static class be accessed withour the object

        obj1.methodB();
    }

}
