import java.util.Scanner;
public class CheckIdentityMatrix{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the dimensions of the matrix");
     int row=sc.nextInt();
     int col=sc.nextInt();
     if (row != col) {
            System.out.println("Not an Identity Matrix");
            sc.close();
            return;
        }
     int[][] matrix=new int[row][col];
     System.out.println("enter the elements ");
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
     }
     boolean isIdentity=true;
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        if(matrix[i][i]!=1){
            isIdentity=false;
            break;
        }else if(matrix[i][j]!=0 && i!=j){
            isIdentity=false;
            break;
        }
        }
        if(!isIdentity){
            break;
        }
     }
     if(isIdentity){
       System.out.println("matrix is an identity matrix");
     }else{
        System.out.println("matrix is not an identity matrix");
     }
     sc.close();
    }
}