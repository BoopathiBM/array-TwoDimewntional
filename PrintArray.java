

public class PrintArray{
    
    public static void printArray(int[][] original){

        System.out.println("Original 2D array is: ");
        System.out.println();
        
        for(int i=0; i < original.length; i++){
            for(int j=0; j < original[0].length;j++){
                System.out.print(original[i][j]+ " ");
            }
            System.out.println();
            
        }

    }
}