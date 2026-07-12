import java.util.*;
public class SortingOddNumbersOnly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]%2==1 && nums[j]%2==1 && nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] =temp;
                }
            }
        }
        System.out.println("Soted array is:"+Arrays.toString(nums));
        sc.close();
    }
}
