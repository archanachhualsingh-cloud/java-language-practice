import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the element");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("Smallest element is: "+smallest);
        sc.close();
    }
}
