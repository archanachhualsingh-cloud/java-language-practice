//FOR SQUARE MATRIX ONLY CAUSE IT IS IN-PLACE ROTATION
import java.util.Scanner;

public class RotateMatrixBy_90degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter the elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // first find transpose of matrix
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // then reverse each row

        for (int i = 0; i < row; i++) {
            int L = 0;
            int R = col - 1;
            while (L < R) {
                int temp = matrix[i][L];
                matrix[i][L] = matrix[i][R];
                matrix[i][R] = temp;
                L++;
                R--;
            }
        }
        System.out.println("Rotated matrix is:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
