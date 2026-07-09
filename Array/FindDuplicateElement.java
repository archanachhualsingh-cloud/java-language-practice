import java.util.Scanner;
public class FindDuplicateElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        boolean found =false;
        for(int i=0;i<nums.length;i++){
            boolean alreadyPrinted=false;
            for(int k=0;k<i;k++){
                if(nums[i]==nums[k]){
                    alreadyPrinted=true;
                    break;
                }
            }
             if(alreadyPrinted){
                    continue;
                }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    System.out.println("Duplicate "+nums[j]);
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No duplicate found");
        }
        sc.close();
    }
}
