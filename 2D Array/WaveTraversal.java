import java.util.Scanner;
public class WaveTraversal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements to the matrix");
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
         }
         System.out.println("Wave traversal:");
        for(int j=0;j<col;j++){
          if(j%2==0){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][j]+" ");
            }
          }else{
            for(int i=row-1;i>=0;i--){
                System.out.print(matrix[i][j]);
            }
          }
          System.out.println(" ");
        }
        sc.close();
    }
}
