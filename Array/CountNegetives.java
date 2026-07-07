import java.util.Scanner;
public class CountNegetives {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of array");
         for(int i=0; i<nums.length;i++){
            nums[i]=sc.nextInt();
         }
         int count=0;
         for(int i=0;i<nums.length;i++){
           if(nums[i]<0){
            count++;
           }
         }
         System.out.println("No. of Negetives:"+ count);
         sc.close();
}
}