// in-place reversal using two pointers
import java.util.Scanner;
public class ReverseArray2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
        System.out.println("elements in revesed order are:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
    static void swap(int[] arr, int i, int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
}
