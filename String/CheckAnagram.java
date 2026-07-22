import java.util.Scanner;
public class CheckAnagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        String s1=sc.nextLine();
        System.out.println("enter string2");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Strings can't be Anagrams cause lengths are different");
            sc.close();
            return;
        }
        boolean isSame=true;
        for(int i=0;i<s1.length();i++){
             char ch=s1.charAt(i);
             int count1=0;
             int count2=0;
             boolean isCounted=false;
              for(int k=0;k<i;k++){
                if(s1.charAt(k)==s1.charAt(i)){
                    isCounted=true;
                  break;
                }
              }
              if(isCounted){
                continue;
              }
              if(!isCounted){
                for(int j=i;j<s1.length();j++){
                    if(ch==s1.charAt(j)){
                        count1++;
                    }
                }
              }
              for(int l=0;l<s2.length();l++){
                if(s2.charAt(l)==ch){
                        count2++;
                    }
                }
              if(count1==count2){
                isSame=true;
                continue;
              }else{
                isSame=false;
                break;
              }
        }
        if(!isSame){
          System.out.println("Strings are not Anagram");
        }else{
            System.out.println("Strings are Anagram");
        }
        sc.close();
    }
}
