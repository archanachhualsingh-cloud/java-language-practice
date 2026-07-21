import java.util.Scanner;
public class FindFirstRepeatedCharachter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        boolean found=false;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    found=true;
                    System.out.println("First repeated character is : "+s.charAt(i));
                    break;
                }
            }
            if(found){
                break;
            }
        }
        sc.close();
    }
}
