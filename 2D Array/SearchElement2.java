//Stairecase Search 
// ---------------(Elements are sorted both columm-wise and row-wise)
import java.util.Scanner;
public class SearchElement2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimension of the matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the target element to be searched");
        int target=sc.nextInt();
       int i=0;
       int j=col-1;
       while(i<row && j>=0){
        if(matrix[i][j]==target){
            System.out.println("element is found at index ["+i+","+j+"]");
            break;
        }else if(matrix[i][j]>target){
            j--;
        }else{
            i++;
        }
       }
       sc.close();
    }
}
