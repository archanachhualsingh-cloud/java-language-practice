import java.util.Scanner;
public class ColumnSum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the dimension of the matrix");
        int row =sc.nextInt();
        int col =sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements to ("+row+"*"+col+") matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++){
               sum+=matrix[j][i];
            }
            System.out.println("Sum of column"+(i+1)+":"+sum);
            sc.close();
        }
    }
}
