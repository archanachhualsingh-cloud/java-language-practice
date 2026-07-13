import java.util.*;
public class SumBetween_LandR {                          // Between indices L and R
    public static void main(String[] args){                      // RANGE SUM QUERIES
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] pSum=new int[n];
        pSum[0]=nums[0];
        for(int i=1;i<pSum.length;i++){
            pSum[i]=pSum[i-1]+nums[i];
        }
        System.out.println("enter intdices:");
        int L=sc.nextInt();
        int R=sc.nextInt();
        int sum=0;
        if(L==0){
            sum=pSum[R];
        }else{
            sum=pSum[R]-pSum[L-1];
        }
        System.out.println("Original array is :"+Arrays.toString(nums));
        System.out.println("Prefix Sum Array is :"+Arrays.toString(pSum));
        System.out.println("sum between "+L+" and "+R+" is "+sum);
        sc.close();
    }
}
