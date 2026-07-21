import java.util.Scanner;
public class CountFrequencyOfChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        boolean[] visited=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            int count = 0;
            if(s.charAt(i)==' '){continue;}
            if(!visited[i]){
            for(int j=i;j<s.length();j++){
                
                    if(s.charAt(i)==s.charAt(j)){
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println("Frequency of "+s.charAt(i)+": "+count);
            }
            
        }
        sc.close();
    }
}
