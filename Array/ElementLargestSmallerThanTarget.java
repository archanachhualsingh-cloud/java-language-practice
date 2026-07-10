import java.util.Scanner;

public class ElementLargestSmallerThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target element:");
        int target = sc.nextInt();
        int largest = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target && nums[i] > largest) {
                found = true;
                largest = nums[i];
            }
        }
        if (!found) {
            System.out.println("Target is the smallest among all");
        }else{
        System.out.println("The element largest smaller than target is:"+largest);
        }
        sc.close();
    }
}
