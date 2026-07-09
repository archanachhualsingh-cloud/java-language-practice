import java.util.Scanner;
public class DeleteAnElementFrom_K {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int size=n;
        int[] nums =new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println("Array is empty.Nothing can be deleted!");
            sc.close();
            return;
        }   
        System.out.println("enter the position of the element to be deleted:");
        int pos=sc.nextInt();
        for(int i=pos;i<nums.length-1;i++){
            nums[i]= nums[i+1];
        }
        size--;
        System.out.println("now the array elements are:");
        for(int i=0;i<size;i++){
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
