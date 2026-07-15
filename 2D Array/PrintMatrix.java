import java.util.*;
public class PrintMatrix{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of the matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements of the matrix("+row+"*"+col+")");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        //System.out.println("Matrix is"+Arrays.deepToString(matrix));
        sc.close();
     }
}