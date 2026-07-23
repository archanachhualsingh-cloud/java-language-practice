import java.util.Scanner;
public class CheckAnagram2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string1 : ");
        String s1=sc.nextLine();
        System.out.println("enter the string2");
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1,s2));
        sc.close();
    }
    static boolean isAnagram(String s, String t){
        int[] freq=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count : freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
