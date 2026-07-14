import java.util.Scanner;
public class MinimumSumOf_kElementa {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the number of elements");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int minSum=sum;
        for(int i=k;i<n;i++){
          sum=sum-nums[i-k]+nums[i];
          minSum=Math.min(minSum,sum);
          System.out.println("Window Sum = " + sum + ", MinSum = " + minSum);
        }
        System.out.println("Minimums Sum Of k Consecutive elements "+minSum);
        sc.close();
    }
}
