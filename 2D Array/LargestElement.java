import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements to("+row+"*"+col+") matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int largest=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+largest);
        sc.close();
    }
}
