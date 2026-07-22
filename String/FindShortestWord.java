import java.util.Scanner;
public class FindShortestWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int shortest=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch!=' ' && (i==0 || s.charAt(i-1)==' ')){
                int count =0;
                int j=i;
                while(j<s.length() && s.charAt(j)!=' '){
                    count++;
                    j++;
                }
                if(count<shortest){
                    shortest=count;
                    l=i;
                    r=i+count;
                }
            }
        }
        System.out.println("Shortest word is "+ s.substring(l,r)+" of length "+shortest);
        sc.close();
    }
}
