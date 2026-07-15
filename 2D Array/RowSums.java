import java.util.Scanner;
public class RowSums {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the dimension of matrix");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] matrix=new int[row][col];
    System.out.println("enter the elements");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<row;i++){
        int sum=0;
        for(int j=0;j<col;j++){
          sum+=matrix[i][j];
        }
        System.out.println("Sum of row"+(i+1)+":"+sum);
    }
    sc.close(); 
   }  
   
}
