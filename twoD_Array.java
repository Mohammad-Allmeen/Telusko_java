public class twoD_Array {
    public static void main(String args[]){
        int num[][]= new int[3][4];
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
              num[i][j]= (int)(Math.random() *10);
              System.out.println(num[i][j]);
            }
        }
    

     for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
             
              System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        // advanced, enhanced and a different approach of printing the two D array

        for (int n[]: num)// n[] is a array that is taking an array from the nums
        {
            for (int m:n){ // now m is taking the value from the array of n
            System.out.print(m+" "); // now we can print the value that is stored in the m variable 
            }
            System.out.println();
        }

    }
}
