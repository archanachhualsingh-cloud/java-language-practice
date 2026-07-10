import java.util.*;
public class SelectionSort{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int[] nums=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    for(int i=0;i<nums.length;i++){
        int smallIndex=i;
        for(int j=i;j<nums.length;j++){
            if(nums[j]<nums[smallIndex]){
               
                smallIndex=j;
            }
        }
         swap(nums,i,smallIndex);
    }
    System.out.println("Sorted array is:");
    System.out.println(Arrays.toString(nums));
    sc.close();
   }
   static void swap(int[] arr,int l,int m){
    int temp=arr[l];
    arr[l]=arr[m];
    arr[m]=temp;
   }
}