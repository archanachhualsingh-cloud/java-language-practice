import java.util.Scanner;
public class TwoSum_SortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target Sum: ");
        int key =sc.nextInt();
        int L=0;
        int R=nums.length-1;
        while(L<R){
            int sum=nums[L]+nums[R];
            if(sum==key){
                System.out.println("Two Sum indices are : ["+L+","+R+"]");
                break;
            }else if(sum<key){
                L++;
            }
            else{
                R--;
            }
        }
        sc.close();
    }
}
