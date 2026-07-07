import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of array");
     int n =sc.nextInt();
     int[] nums=new int[n];
     System.out.println("enter the elements");
     for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
     }
     int[] rev =new int[nums.length];
     int j=0;
     for(int i=0;i<nums.length;i++){
        rev[j++]=nums[i];
     }
     System.out.println("elements of reversed array are");
     for(int i=0;i<rev.length;i++){
        System.out.println(rev[i]);
     }
     sc.close();
    }
}