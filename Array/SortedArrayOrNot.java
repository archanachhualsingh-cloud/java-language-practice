import java.util.Scanner;
public class SortedArrayOrNot {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
            if(isSorted(nums)){
                System.out.println("Array is sorted");
            }else{
                System.out.println("Array is not sorted");
            }
        sc.close();
    }
    static boolean isSorted(int[] arr){
        boolean ascending=true;
        boolean descending=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                ascending=false;
            }
            if(arr[i]<arr[i+1]){
                descending=false;
            }
        }
        return ascending || descending;
    }
}
