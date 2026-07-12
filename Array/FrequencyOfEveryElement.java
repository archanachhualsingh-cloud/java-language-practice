import java.util.*;
public class FrequencyOfEveryElement {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        boolean[] visited=new boolean[n];
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j]=true;
                }
                
            }
            System.out.println("Fequency of "+nums[i]+" is "+count);
        }
        sc.close();
    }
}
