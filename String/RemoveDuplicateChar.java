import java.util.Scanner;
public class RemoveDuplicateChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            boolean isConsidered=false;
            for(int k=0;k<i;k++){
               if(ch==s.charAt(k)){
                isConsidered=true;
                break;
               }
            }
            if(!isConsidered){
                System.out.print(s.charAt(i)+" ");
            }
        }
        sc.close();
    }
}
