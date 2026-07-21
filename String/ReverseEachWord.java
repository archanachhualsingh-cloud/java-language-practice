import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int j=0;
        for(int i=0;i<c.length;i++){
            
           if(c[i]==' ' || i==c.length-1){
             int l=j;
             int m=(i==c.length-1)?i:i-1;
              while(l<m){
                char ch=c[m];
                c[m]=c[l];
                c[l]=ch;
                l++;
                m--;
              }
              j=i+1;
           }
        }
        System.out.println("Reversed String is : ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        sc.close();
    }
}
