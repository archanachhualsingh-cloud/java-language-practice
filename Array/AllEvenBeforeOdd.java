import java.util.Scanner;
public class AllEvenBeforeOdd {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[i];
                for(int l=i;l>j;l--){
                   nums[l]=nums[l-1];
                }
                nums[j]=temp;
                j++;
            }
        }
        System.out.println("the new array elements are");
        for(int num:nums){
            System.out.println(num);
        }
        sc.close();
    }
}
