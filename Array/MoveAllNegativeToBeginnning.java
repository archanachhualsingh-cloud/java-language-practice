import java.util.Scanner;
public class MoveAllNegativeToBeginnning {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums =new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] result =new int[nums.length];
        int index =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                result[index++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[index++]=nums[i];
            }
        }
        System.out.println("new array elements are");
        for(int res : result){
            System.out.print(res+" ");
        }
        sc.close();
    }
}
