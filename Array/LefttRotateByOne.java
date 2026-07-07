import java.util.Scanner;
public class LefttRotateByOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums =new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        leftRotateByOne(nums);
        for(int num : nums){
            System.out.println(num);
        }
        sc.close();
    }
    static void leftRotateByOne(int[] arr){
       int temp = arr[0];
       for(int i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];
       }
       arr[arr.length-1]=temp;
    }
}
