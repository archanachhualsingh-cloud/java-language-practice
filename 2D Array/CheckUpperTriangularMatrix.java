import java.util.Scanner;
public class CheckUpperTriangularMatrix{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimensions of the matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
       System.out.println("enter the elements of matrix");
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
       }
       boolean isUpperTri=true;
       for(int i=0;i<row;i++){
        for(int j=0;j<i;j++){
          if(matrix[i][j]!=0){
            isUpperTri=false;
            break;
          }
        }
        if(!isUpperTri){
            break;
        }
       }
       if(isUpperTri){
        System.out.println("Matrix is Upper Triangular");
       }else{
        System.out.println("Matrix is not Upper Triangular");
       }
       sc.close();
     }
}