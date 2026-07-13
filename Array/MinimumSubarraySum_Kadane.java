import java.util.Scanner;
public class MinimumSubarraySum_Kadane {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int minEndingHere=nums[0];
        int minSoFar=nums[0];
        for(int i=1;i<nums.length;i++){
            minEndingHere=Math.min(nums[i],minEndingHere+nums[i]);
            minSoFar=Math.min(minSoFar,minEndingHere);
        }
        System.out.println("Minimum Subarray Sum :"+minSoFar);
        sc.close();
    }
}
