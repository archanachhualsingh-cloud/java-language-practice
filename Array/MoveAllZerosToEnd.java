import java.util.Scanner;
public class MoveAllZerosToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int[]  nums=new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int left=0;
        // below solution gives O(n^2) time complexity
        // int right=nums.length-1;
        // while(left<right){
        //     if(nums[left]==0){
        //         for(int i=left;i<right;i++){
        //             nums[i]=nums[i+1];
        //         }
        //         nums[right]=0;
        //         if(nums[left]!=0){
        //             left++;
        //         right--;
        //         }else{
        //             continue;
        //         }
        //     }else{
        //         left++;
        //     }
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
        System.out.println("now the array is");
        for(int num : nums){
            System.out.println(num);
        }
        sc.close();
    }
}
