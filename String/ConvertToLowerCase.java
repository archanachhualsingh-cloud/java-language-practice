import java.util.Scanner;
public class ConvertToLowerCase {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string in upper case");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=92){
                System.out.print((char)(ch+32));
            }else{
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
