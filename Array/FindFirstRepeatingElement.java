import java.util.Scanner;

public class FindFirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("first repeating element is:" + nums[i]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No repeating element found");
        }
        sc.close();
    }
}
