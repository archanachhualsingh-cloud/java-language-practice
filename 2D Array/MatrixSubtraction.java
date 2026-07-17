import java.util.Scanner;
public class MatrixSubtraction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix1=new int[r][c];
        int[][] matrix2=new int[r][c];
        int[][] diff=new int[r][c];
        System.out.println("enter the elements to matrix1");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements to matrix2");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                diff[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        System.out.println("Difference is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(diff[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
