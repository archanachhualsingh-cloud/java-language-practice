import java.util.Scanner;
public class CountLowerCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                count++;
            }
        }
        System.out.println("Number of Lowercase letters: "+count);
        sc.close();
    }
}
