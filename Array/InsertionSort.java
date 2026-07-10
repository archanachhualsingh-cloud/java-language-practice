import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<nums.length;i++){
            int key =nums[i];
            int j=i-1;
           while(j>=0 && nums[j]>key){
            nums[j+1]=nums[j];
            j--;
           }
           nums[j+1]=key;
            }
        System.out.println("Sorted array:"+Arrays.toString(nums));
        sc.close();
    }
   
}
