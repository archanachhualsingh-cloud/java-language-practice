import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();
        // for(int i=0;i<s1.length();i++){
        //     char ch=Character.toLowerCase(s1.charAt(i));
        //     if(ch!='a' && ch!='e' && ch!='i' &&  ch!='o' && ch!='u'){
        //         System.out.print(ch);
        //     }
        // }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch=Character.toLowerCase(s1.charAt(i));
            if(ch!='a' && ch!='e' && ch!='i' &&  ch!='o' && ch!='u'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
