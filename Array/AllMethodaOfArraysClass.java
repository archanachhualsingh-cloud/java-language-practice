import java.util.*;

public class AllMethodaOfArraysClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
        }
        Arrays.parallelPrefix(nums,Integer::sum);
        //Arrays.setAll(nums,i->i*10);
        //int[] rnums={3,8,9,4,6,57,1,11,21,7};                            //deepEquals(a,b)-compares nested arrays(multidimensional arrays)
        //int[] copy=Arrays.copyOf(nums,12);                               //deepToString(arr)-converts a multidimensional array
        //int[] copy=Arrays.copyOfRange(nums,2,7);
        //Arrays.fill(nums, 7);
        //Arrays.fill(nums,2,7,7);
        // Arrays.sort(nums);
        // Arrays.sort(nums,2,8);
        // Arrays.parallelSort(nums);
        // Arrays.parallelSort(nums,2,8);
        // int index= Arrays.binarySearch(nums,6);
        // int index=Arrays.binarySearch(nums,5,9,63);
        // System.out.println(index);
        System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(copy));
        //System.out.println(Arrays.equals(nums,rnums));
        //System.out.println(Arrays.mismatch(nums,rnums));
        sc.close();
    }
}
