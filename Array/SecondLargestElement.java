import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] argd){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int fl=0;
        int sl=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                if(fl<nums[i+1]){
                    sl=fl;
                    fl=nums[i+1];
                }
                else{
                    sl=nums[i+1];
                }
            }
        }
        System.out.println("first largest element is:"+fl);
        System.out.println("second largest element is:"+sl);
         sc.close();
    }
}
