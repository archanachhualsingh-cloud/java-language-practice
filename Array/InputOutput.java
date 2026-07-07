import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println("enter the size of array");
          int n=sc.nextInt();
          int[] arr =new int[n];
          System.out.println("enter the elements");
          for(int i=0;i<n;i++){       
            arr[i]=sc.nextInt();
          }
          for(int arrs : arr){                 // Enhanced for loop or for-each loop
            System.out.print(arrs +" ");
          }
          sc.close();
    }
}