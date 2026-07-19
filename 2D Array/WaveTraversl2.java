import java.util.Scanner;
public class WaveTraversl2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
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
        System.out.println("Wave Traversal (Row wise)");
        for(int i=0;i<row;i++){
            if(i%2==0){
                for(int j=-0;j<col;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else{
                    for(int j=col-1;j>=0;j--){
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                System.out.println("");
        }
        sc.close();
    }
}
