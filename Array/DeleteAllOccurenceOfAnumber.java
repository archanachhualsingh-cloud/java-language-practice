import java.util.Scanner;
public class DeleteAllOccurenceOfAnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int size=n;
        int[] nums=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the element whose all occurence to be deleted");
        int target=sc.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                nums[i]=0;
                size--;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            j++;
            }
        }
        System.out.println("now the elements are:");
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
