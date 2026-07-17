import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the dimensions of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix1=new int[row][col];
        int[][] matrix2= new int[row][col];
        int[][] sum=new int[row][col];
        System.out.println("enter the elements to matirx1 ("+row+"*"+col+")");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements to matrix2 ("+row+"*"+col+")");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
