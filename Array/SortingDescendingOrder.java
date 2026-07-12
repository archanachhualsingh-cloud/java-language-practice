import java.util.*;
public class SortingDescendingOrder {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<nums.length;i++){
            boolean swapped=false;
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                    swap(nums,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println("Finally sorted array is :"+Arrays.toString(nums));
        sc.close();
    }
    static void swap(int[] arr,int l,int m){
        int temp=arr[l];
        arr[l]=arr[m];
        arr[m]=temp;
    }
}
