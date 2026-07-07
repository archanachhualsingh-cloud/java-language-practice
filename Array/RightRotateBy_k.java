import java.util.Scanner;
public class RightRotateBy_k {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the number of position");
        int k=sc.nextInt();
        rightRotateBy_k(nums,k);
        System.out.println("new array elements are:");
        for(int num:nums){
            System.out.println(num);
        }
        sc.close();
    }
    static void rightRotateBy_k(int[] arr,int i){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,i-1);
        reverse(arr,i,arr.length-1);
    }
    static void reverse(int[] arr, int l,int m){
        int left=l;
        int right=m;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
