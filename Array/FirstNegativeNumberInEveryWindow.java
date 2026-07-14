import java.util.Scanner;
public class FirstNegativeNumberInEveryWindow {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the size of the window");
        int k=sc.nextInt();
        for(int i=0;i<n-k+1;i++){
            for(int j=i;j<i+k;j++){
               if(nums[j]<0){
                System.out.println("First negative of Window "+(i+1)+"is "+nums[j]);
                break;
               }
            }
        }
        sc.close();
    }
}
