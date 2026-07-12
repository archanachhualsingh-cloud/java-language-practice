import java.util.Scanner;
public class LeastFrequentElement {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int leastFrequent=Integer.MAX_VALUE;
        int index =0;
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
          if(count<leastFrequent){
            leastFrequent=count;
            index=i;
          }
        }
        System.out.println("The least frequent element is : "+nums[index]+" with frequency "+leastFrequent);
        sc.close();
    }
}
