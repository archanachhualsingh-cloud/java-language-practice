import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String s1=sc.nextLine();
        // for(int i=0;i<s1.length();i++){
        //     char c=s1.charAt(i);
        //     if(c!=' '){
        //         System.out.print(c);
        //     }
        // }
        
        // s1=s1.replace(" ","");
        // System.out.println(s1);

        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
