import java.util.Scanner;
public class SearchAnElement1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
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
        boolean found=false;
        System.out.println("enter the target");
        int target=sc.nextInt();
        int L=0;
        int R=0;
        for(int i=0;i<row;i++){
            L=i;
            for(int j=0;j<col;j++){
                if(matrix[i][j]==target){
                  found=true;
                  R=j;
                  break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("element is not present in this matrix");
        }
        System.out.println("elements is found at index ["+L+","+R+"]");
        sc.close();
    }
}
