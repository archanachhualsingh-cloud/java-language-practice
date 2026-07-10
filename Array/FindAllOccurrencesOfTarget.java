import java.util.Scanner;
public class FindAllOccurrencesOfTarget {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums =new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target");
        int target=sc.nextInt();
        int count=0;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found=true;
                System.out.println("Occurrence"+ (++count)+" found at index"+ i);
            }
        }
        if(!found){
            System.out.println("No Occurrence found");
        }
        sc.close();
    }
}
