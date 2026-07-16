import java.util.Scanner;
public class SecondaryDiagonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of a square matrix ");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("enter the elements to ("+n+"*"+n+") matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][n-i-1];
        }
        System.out.println("Secondary Diagonal Matrix: "+sum);
        sc.close();
    }
}
