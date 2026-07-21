import java.util.Scanner;
public class ConvertToUpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string in LowerCase");
        String s1=sc.nextLine();
        // for(int i=0;i<s1.length();i++){
        //     char ch=s1.charAt(i);
        //     if(ch>=97 && ch<=122){
        //        // System.out.print(Character.toString(ch-32));
        //        System.out.print((char)(ch-32));
        //     }
        // }

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='a' && ch<= 'z'){
                System.out.print((char)(ch-32));
            }else{
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
