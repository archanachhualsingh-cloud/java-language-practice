import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the target element to be searched");
        int key=sc.nextInt();
        Boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                found=true;
              System.out.println("Element found at index:"+i);
              break;
            }
        }
        if(!found){
            System.out.println("Element is not present");
        }
        sc.close();
    }
}
