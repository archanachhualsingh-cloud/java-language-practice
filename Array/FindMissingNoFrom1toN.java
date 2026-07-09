import java.util.Scanner;
public class FindMissingNoFrom1toN {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements of array(from 1 to"+n+":");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int found=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=(i+1)){
                found=i;
                break;
            }
        }
        System.out.println("The missing element is "+(found+1));
        sc.close();
    }
}
