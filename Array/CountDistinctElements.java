import java.util.Scanner;
public class CountDistinctElements {
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int[] nums=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<nums.length;i++){
        boolean isDistinct=true;
     for(int j=0;j<i;j++){
        if(nums[i]==nums[j]){
            isDistinct=false;
            break;
        }
     }
     if(isDistinct){
        count++;
     }
    }
    System.out.println("Number of distinct elemments are: "+count);
    sc.close();
   } 
}
