import java.util.Scanner;
public class MaximumSubarrayProduct {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int maxEndingHere=nums[0];
        int minEndingHere=nums[0];
        int maxSoFar=nums[0];
        for(int i=0;i<nums.length;i++){
            int newMax=Math.max(nums[i],Math.max(maxEndingHere*nums[i],minEndingHere*nums[i]));
            int newMin=Math.min(nums[i],Math.min(maxEndingHere*nums[i],minEndingHere*nums[i]));
            maxEndingHere=newMax;
            minEndingHere=newMin;
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        System.out.println("Maximum Subarray Product"+maxSoFar);
        sc.close();
    }
}
