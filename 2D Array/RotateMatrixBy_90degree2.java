
//For every matrix as we are using different matrix here
import java.util.Scanner;

public class RotateMatrixBy_90degree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of the matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter the elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] rotated = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rotated[j][row - 1 - i] = matrix[i][j];
            }
        }
        System.out.println("Rotated matrix is");
        for(int i=0;i<col;i++){
            for(int j=0;j<col;j++){
                System.out.print(rotated[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
