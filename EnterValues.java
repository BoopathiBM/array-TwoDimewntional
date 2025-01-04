
import java.util.Scanner;

public class EnterValues{
    
    public int[][] enterValues(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int column = scanner.nextInt();

       int[][] original =new int[rows] [column];




        System.out.println("Enter the values of original: ");
        for(int i=0 ; i< rows; i++){
            for(int j=0; j < column; j++){
             System.out.println("Enter Element at row(" + i  + ") and column ( " + j + " ) : ");
             original[i][j] = scanner.nextInt();   
            }
        }
        return original;  

        
    }
}