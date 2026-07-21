import java.util.Scanner;
public class CountConsonants {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int count=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=Character.toLowerCase(s.charAt(i));
        //     if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
        //         count++;
        //     }
        // }
        for(char ch:s.toLowerCase().toCharArray()){
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                count++;
            }
        }
        System.out.println("Number of Consonants is : "+count);
        sc.close();
    }
}
