import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        int l=0;
        int r=s1.length()-1;
        char[] ch=s1.toCharArray();
        while(l<r){
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
        }
        String s2=new String(ch);
        if(s1.equals(s2)){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not an palindrome");
        }
        sc.close();
    }
}
