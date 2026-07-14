import java.util.Scanner;
public class MaximumSumOf_kElements {
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
            System.out.println(sum);
        }
        int maxSum=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println("Maximum Sum Of K consecutive elements :"+sum);
        sc.close();
    }
}
