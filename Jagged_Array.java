//Jagged array is the array where we can specify different and variation in size for the array rows and coloums
// means every rows and columns can have a different and specific length


public class Jagged_Array {
    public static void main(String args[]){
        int num[][]= new int[3][];

        num[0]= new int[3];
        num[1]= new int[4];
        num[2]= new int[5];
         
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
              num[i][j]= (int)(Math.random()*10);
              System.out.println(num[i][j]);
            }
        }

        // advanced, enhanced and a different approach of printing the two D array
        // one of the advantage of enhanced for loop is that you do not need to mention the size it automatically detects it.

        for (int n[]: num)// n[] is a array that is taking an array from the nums means it receives one D array form the 2D array 
        {
            for (int m:n){ // now m is taking the value from the array of n means m receive each element from the one Array of n[]
            System.out.print(m+" "); // now we can print the value that is stored in the m variable 
            }
            System.out.println();
        }

    }
}
