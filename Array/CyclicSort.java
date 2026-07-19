import java.util.*;
public class CyclicSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
             swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        System.out.println("sorted array is :"+Arrays.toString(nums));
        sc.close();
    }
    static void swap(int[] arr,int l,int m){
        int temp=arr[l];
        arr[l]=arr[m];
        arr[m]=temp;
    }
}
