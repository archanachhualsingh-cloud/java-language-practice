import java.util.Scanner;
public class InsertAnElementAt_K{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity of the array");
        int cap =sc.nextInt();
        int[] nums=new int[cap];
        System.out.println("enter the size of  the array:");
        int size=sc.nextInt();
        if(size>cap){
            System.out.println("Size can't be greater than cap");
            sc.close();
            return;
        }
        System.out.println("enter the elements:");
        for(int i=0; i<size;i++){
         nums[i]=sc.nextInt();
        }
        if(size==cap){
            System.out.println("Array is full.elements can't be inserted!");
            sc.close();
            return;
        }
        System.out.println("enter the position to be inserted(0 to "+size+":");
        int position=sc.nextInt();
        if(position<0 || position>cap){
            System.out.println("invalid position");
            sc.close();
            return;
        }
        System.out.println("enter the element to be inserted:");
        int insert=sc.nextInt();
        for(int i=size;i>position;i--){
          nums[i]=nums[i-1];
        }
        nums[position]=insert;
        System.out.print("new array is:");
        for(int i=0;i<size;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}