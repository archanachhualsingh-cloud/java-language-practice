import java.util.*;
public class SortStringsAlphabetically {
    public  void main(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of the Strings");
        int n =sc.nextInt();
        sc.nextLine();
        String[] str =new String[n];
        System.out.println("enter the elements");
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
         for(int i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-1-i;j++){
                if(str[j].compareToIgnoreCase(str[j+1])>0){
                    String temp= str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
         }                                                                                              //banana
         System.out.println("Sorted string array is:"+Arrays.toString(str));                           // apple
             sc.close();                                                                              //  mango
                                                                                                     // grapes
    }
}
