public class enhanced_array {
    public static void main(String [] args){
   int arr[]= new int[4];

   for (int i = 0; i < arr.length; i++) {
    arr[i]= i;

   }
    for (int n: arr){ // enhanced for loop where you do not need a counter the n variable iterated over the array one value at a time the end of the array 
        // therefor no i, no counter, no need to check for the length

    System.out.println(n);
    }
    }
}
