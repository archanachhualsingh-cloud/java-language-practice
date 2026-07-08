import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int count=0;
        int size=nums.length;
        for(int i=0;i<size-count;i++){
             int k=i+1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]!=nums[i]){   
                    int temp=nums[k];
                    nums[k]=nums[j];
                    nums[j]=temp;
                    k++;
                }else{
                    count++;
                }
            }
        }
        System.out.println("elements of new arrays are:");
            for(int i=0;i<size-count;i++){
                System.out.println(nums[i]);
            }
            sc.close();
    }
}
