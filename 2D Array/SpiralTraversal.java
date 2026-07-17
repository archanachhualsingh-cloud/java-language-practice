import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of the matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter the elements ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int left = 0;
        int right = col - 1;
        int top = 0;
        int bottom = row - 1;
        while (left <= right && top <= bottom) {
            for (int co = left; co <= right; co++) {
                System.out.println(matrix[top][co] + " ");
            }
            top++;
            for (int ro = top; ro <= bottom; ro++) {
                System.out.println(matrix[ro][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int co = right; co >= left; co--) {
                    System.out.println(matrix[bottom][co] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int ro = bottom; ro >= top; ro--) {
                    System.out.println(matrix[ro][left]);
                }
                left++;
            }
        }
        sc.close();
    }
}
