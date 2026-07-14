import java.util.Scanner;
public class RemoveDuplicates_SortedArray {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println("New array is : ");
        for(int k=0;k<(i+1);k++){
            System.out.println(nums[k]);
        }
        sc.close();
    }
}
