import java.util.Scanner;
public class CheckSymmetricMatrix {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the dimensions of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(row!=col){
            System.out.println("Matrix must be a square matrix");
            sc.close();
            return;
        }
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean isSymmetric=true;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                if(matrix[i][j]!=matrix[j][i]){
                  isSymmetric=false;
                  break;
                }
            }
            if(!isSymmetric){
                break;
            }
        }
        if(isSymmetric){
            System.out.println("Matrix is Symmetric");
        }else{
            System.out.println("Matrix is not Symmetric");
        }
        sc.close();
    }
}
