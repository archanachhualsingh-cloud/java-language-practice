import java.util.Scanner;
public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
              boolean repeated=false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                System.out.println("First non repeating character is : "+s.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
