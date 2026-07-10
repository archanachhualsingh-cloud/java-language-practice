import java.util.Scanner;
public class ElementSmallestGreaterThanTarget {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target =sc.nextInt();
        int smallest=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target && nums[i]<smallest){
                found=true;
                smallest=nums[i];
            }
        }
        if(!found){
            System.out.println("Target is the largest among all");
        }else{
            System.out.println("The element smallest greater than target is:"+smallest);
        }
        sc.close();
    }
}
