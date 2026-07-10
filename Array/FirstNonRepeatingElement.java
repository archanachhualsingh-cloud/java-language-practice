import java.util.Scanner;
public class FirstNonRepeatingElement {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            boolean isRepeating = false;
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[j]==nums[i]){
                    isRepeating = true;
                    break;
                }
            }
            if(!isRepeating){
                found = true;
                System.out.println("First non-repeating element is :"+nums[i]);
                break;
            }
        }
        if(!found){
            System.out.println("there is no non repeating element");
        }
        sc.close();
    }
}
