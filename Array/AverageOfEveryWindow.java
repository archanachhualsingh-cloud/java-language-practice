import java.util.Scanner;
public class AverageOfEveryWindow {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the number of elements");
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int j=1;
        for(int i=k;i<=n;i++){
            double average=(double)sum/k;
            System.out.println("Average of Window "+j++ +"is "+average);
            if(i<n){
            sum=sum-nums[i-k]+nums[i];
            }
        }
        sc.close();
    }
}
