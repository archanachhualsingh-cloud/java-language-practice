//Find the longest substring without repeating characters
import java.util.Scanner;
public class SlidingWindow1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        System.out.println(lengthOfTheLongestSubString(s));
        sc.close();
    }
    static int lengthOfTheLongestSubString(String s){
        int[] lastSeen=new int[128];
        for(int i=0;i<lastSeen.length;i++) lastSeen[i] = -1;
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            int charIndex=s.charAt(right);
             if(lastSeen[charIndex] >= left){
                 left = lastSeen[charIndex] + 1;
             }
             lastSeen[charIndex]=right;
             maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
