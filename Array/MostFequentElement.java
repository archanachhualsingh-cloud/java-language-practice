import java.util.*;
public class MostFequentElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int mostFrequent=0;
        int index =0;
        boolean[] visited =new boolean[n];
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int count =1;
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]){
                count++;
                visited[j]=true;
               }
            }
            if(count>mostFrequent){
                mostFrequent=count;
                index=i;
            }
        }
        System.out.println("Most Frequent element is : "+nums[index]+" with frequency: "+mostFrequent);
        sc.close();
    }
}
