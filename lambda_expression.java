//concept of the functional interface and lambda expression


interface lambda{
//void show(String topic);

int add(int a, int b);
}

public class lambda_expression {
    public static void main(String[] args){
    // this same below expression can be written in the form of the lambda expression
    
    // lambda obj= new lambda() {
    //     public void show(String topic){
    //         System.out.println("The Concept of the " + topic + " expression.");
    //     }
    // };

// The above anonymous class with the method can be written in the form of Lambda expression and as it is the SAM interface it contains only method therefore you do not need to mention the method name

    // lambda obj=(topic)-> {        // if no value is passed the () will be empty
    //  System.out.println("The Concept of the " + topic + " expression.");
    // };

    // obj.show("Lambda");


lambda obj= (a,b)-> a+b;

int result =obj.add(5,4);
System.out.println("The addition is: "+result);

}
}
