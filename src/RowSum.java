import java.util.ArrayList;
import java.util.Scanner;

public class RowSum {
    static ArrayList<Integer> findRowSum(int[][] matrix, int rows, int cols){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            int sum = 0;
            for(int j = 0; j < cols; j++){
                sum+=matrix[i][j];
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Array elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(findRowSum(matrix, rows, cols));
    }
}
