import java.util.*;
public class MaximumSubarraySum_Kadane {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int maxEndingHere=nums[0];
        int maxSoFar=nums[0];;
        for(int i=1;i<nums.length;i++){
            maxEndingHere=Math.max(nums[i],maxEndingHere+nums[i]);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        System.out.println("Maximum Subarray Sum is :"+maxSoFar);
        sc.close();
    }
}
