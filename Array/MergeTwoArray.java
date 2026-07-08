import java.util.Scanner;
public class MergeTwoArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of arrays");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums1=new int[n];
        int[] nums2=new int[m];
        System.out.println("enter the elements of first array");
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("enter the elements of second array");
        for(int i=0;i<nums2.length;i++){
            nums2[i]=sc.nextInt();
        }
        int[] nums=new int[n+m];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            nums[index++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            nums[index++]=nums2[i];
        }
        System.out.print("Merged array is :");
        for(int  i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}
