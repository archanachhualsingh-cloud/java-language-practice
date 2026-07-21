import java.util.Scanner;
public class CountSpaces2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch)){
                count++;
            }
        }
        System.out.println("Number of whitespaces are : "+count);
        sc.close();
    }
}
