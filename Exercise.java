public class Exercise {
    public static void main(String[] args) {
 
        String name ="Allmeen";
        
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
   int arr[]= new int[6];
   
   arr[0]= 45;
   arr[1]= 22;
   arr[2]= 89;
   arr[3]= 16;
   arr[4]= 90;
   arr[5]= 33;
   
   
        // TODO: Initialize min and max with the first element

int min= arr[0];
int max= arr[0];

        // TODO: Use an enhanced for loop to find min and max

for(int n: arr){
    if (n>=max){
        max=n;
    }
}

for(int i: arr){
    if (i<=min){
        min=i;
    }
}

System.out.println("The min number is "+ min +" and the max number is: "+max);
        // TODO: Print the smallest and largest numbers
    }
}
