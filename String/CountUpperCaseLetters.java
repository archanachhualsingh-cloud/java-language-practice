import java.util.Scanner;
public class CountUpperCaseLetters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)>=65 && s.charAt(i)<=90){
                  count++;
             }
        }
        System.out.println("Number of Uppercase Letters are :"+count);
        sc.close();
    }
}
