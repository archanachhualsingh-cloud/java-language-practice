import java.util.*;
public class CheckPalindromeArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] rnums=new int[n];
        for(int i=0;i<rnums.length;i++){
            rnums[i]=nums[n-i-1];
        }
        System.out.println("Array is a palindrome array:"+Arrays.equals(nums,rnums));
        sc.close();
    }
}
