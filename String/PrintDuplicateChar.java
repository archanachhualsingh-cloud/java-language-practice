import java.util.Scanner;
public class PrintDuplicateChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String s=sc.nextLine();
        System.out.println("Duplicate Characters are: ");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            boolean isChecked=false;
            for(int k=0;k<i;k++){
                if(s.charAt(k)==ch){
                    isChecked=true;
                    break;
                }
            }
            if(!isChecked){
              for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==ch){
                    System.out.print(s.charAt(i)+" ");
                    break;
                }
              }
            }
        }
        sc.close();
    }
}
