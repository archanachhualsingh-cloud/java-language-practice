import java.util.Scanner;

public class BoundaryElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[row][cols];
        System.out.println("enter the elements to (" + row + "*" + cols + ") matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // int i = 0;
        // int j = 0;
        //   1.  THIS ALGORITHM PASSED 1*1 , 1*N ,N*1, 2*2 ,N*2 BUT FAILED AT 2*N
         
        // boolean[][] visited = new boolean[row][col];
         System.out.println("Boundary elements are:");
        // while (i < row && j < col && i >= 0 && j >= 0) {
        //     if (i != (row - 1) && j == (col - 1)) {
        //         if (!visited[i][j]) {
        //             System.out.println(matrix[i][j]);
        //             visited[i][j] = true;
        //             i++;
        //         }else{
        //             i--;
        //         }

        //     } else if (i == (row - 1) && j != 0) {
        //         if (!visited[i][j]) {
        //             System.out.println(matrix[i][j]);
        //             visited[i][j] = true;
        //             j--;
        //         }else{
        //             j++;
        //         }

        //     } else if (i != 0 && j == 0) {
        //         if (!visited[i][j]) {
        //             System.out.println(matrix[i][j]);
        //             visited[i][j] = true;
        //             i--;
        //         }else{
        //             i++;
        //         }

        //     } else if (i == 0 && j == 0) {
        //         if (!visited[i][j]) {
        //             System.out.println(matrix[i][j]);
        //             visited[i][j] = true;
        //             j++;
        //         }else{
        //             j++;
        //         }

        //     } else {
        //         System.out.println(matrix[i][j]);

        //         j++;
        //     }
        // }

        // 2. THIS ALGORITHM PRINTS BOUNDARY ELEMENTS BUT NOT IN CLOCK-WISE ORDER

        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // if(i==0 ||i==(row-1) || j==0 || j==(col-1)){
        // System.out.println(matrix[i][j]+" ");
        // }
        // }
        // }

        // 3. STANDARD SOLUTION IS
         
        for(int j=0;j<cols;j++){
            System.out.println(matrix[0][j]+ " ");
        }
        for(int i=1;i<row;i++){
            System.out.println(matrix[i][row-1]);
        }
        if(row>1){
            for(int j=cols-2;j>=0;j--){
                System.out.println(matrix[row-1][j]+" ");
            }
        }
        if(cols>1){
            for(int i=row-2;i>=1;i--){
                System.out.println(matrix[i][0]+" ");
            }
        }
        sc.close();
    }
}
