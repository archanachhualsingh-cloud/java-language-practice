import java.util.Scanner;
public class Transpose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the dimension of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[][] transpose=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transpose matrix is ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
