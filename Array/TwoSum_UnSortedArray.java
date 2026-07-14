import java.util.*;
public class TwoSum_UnSortedArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target Sum: ");
        int key=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==key){
                    System.out.println("Indices are: ["+i+","+j+"]");
                    break;
                }
            }
        }
        sc.close();
    }
}
