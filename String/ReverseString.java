import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
        }
        //String s1=new String(ch);
        //System.out.println(s1);

        // s=new String(ch);
        // System.out.println(s);
        
        // s=new String(ch);
        // for(int i=0;i<s.length();i++){
        //   System.out.print(s.charAt(i));
        // }

        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

       // System.out.println("Reverse String is :"+Arrays.toString(ch));     // gives [a, n, a, h, c, r, A]
        sc.close();
    }
}