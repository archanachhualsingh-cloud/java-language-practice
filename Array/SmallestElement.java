import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1] && smallest>nums[i]){
                smallest=nums[i];
            }
        }
        System.out.println("the smallest element is "+ smallest);
        sc.close();
    }
}
