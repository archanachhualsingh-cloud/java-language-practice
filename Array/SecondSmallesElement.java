import java.util.Scanner;

public class SecondSmallesElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int fs = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < nums[i + 1]) {
                if (fs > nums[i]) {
                    ss = fs;
                    fs = nums[i];
                } else if (fs < nums[i] && ss > nums[i]) {
                    ss = nums[i];
                }
            }
        }
        System.out.println("first smallest element is:" + fs);
        System.out.println("second smallest element is" + ss);
        sc.close();
    }
}
