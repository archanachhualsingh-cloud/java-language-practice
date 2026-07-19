import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int left=0;
        int right=nums.length-1;
        System.out.println("enter the target");
        int target=sc.nextInt();
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                System.out.println("Target is found at index"+mid);
                break;
            }else if(nums[mid]>target){
                right=mid-1;
            }else {
                mid=left+1;
            }
        }
        sc.close();
    }
}
