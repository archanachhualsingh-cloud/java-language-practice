import java.util.Scanner;
public class BoundaryElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dimension of matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the elements to ("+row+"*"+col+") matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //  int i=0;
        //  int j=0;
        //  boolean isPrinted=false;
        //  System.out.println("Boundary elements are:");
        //  while(i<row && j<col && i>=0 && j>=0){
        //     if(i!=(row-1) && j==(col-1)){
        //      System.out.println(matrix[i][j]);
        //      i++;
        //     }else if(i==(row-1) && j!=0 ){
        //         System.out.println(matrix[i][j]);
        //         j--;
        //     }else if(i!=0 && j==0 ){
        //         System.out.println(matrix[i][j]);
        //         i--;
        //     }else if(i==0 && j==0){
        //         if(isPrinted){
        //             break;
        //         }
        //         System.out.println(matrix[i][j]);
        //        isPrinted=true;
        //        j++;
        //     }else{
        //         System.out.println(matrix[i][j]);
                
        //         j++;
        //     }
        //  }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0 ||i==(row-1) || j==(col-1)){
                    System.out.println(matrix[i][j]+" ");
                }
            }
        }
         sc.close();
    }
}
