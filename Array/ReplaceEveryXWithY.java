import java.util.Scanner;
public class ReplaceEveryXWithY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter X and Y");
        int X=sc.nextInt();
        int Y=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==X){
                nums[i]=Y;
            }
        }
        System.out.print("Now the array is:");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
