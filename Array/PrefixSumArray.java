import java.util.*;
public class PrefixSumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] pSum=new int[n+1];
        for(int i=1;i<pSum.length;i++){
            pSum[i]=pSum[i-1]+nums[i-1];
        }
        System.out.print("original array: "+Arrays.toString(nums));
        System.out.println("Prefix Sum Array: "+Arrays.toString(pSum));
        sc.close();
    }
}
