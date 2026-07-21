import java.util.Scanner;
public class ReverseSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r){
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
        }
        System.out.println("Reversed string is :");
        for(int i=0;i<ch.length-1;i++){
            System.out.print(ch[i]);
        }
        sc.close();
    }
}
