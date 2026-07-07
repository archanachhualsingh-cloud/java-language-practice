import java.util.Scanner;
public class SumOfAllElements {
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of array");
    int n =sc.nextInt();
    int[] nums =new int[n];
    System.out.println("enter the elements of array");
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
    System.out.println("Sum="+sum);
    sc.close();
   } 
}
