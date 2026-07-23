import java.util.*;

public class StrinngFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = new String("archana priyadarshin chhualsingh");
        String s2 = new String("Archana Priyadarshin Chhualsingh");

        // System.out.println(s1.contains("priya"));

        // boolean i=s1.startsWith("arch");
        // System.out.println(i);

        // boolean i=s1.endsWith("ngh");
        // System.out.println(i);

        int i=s1.compareTo(s2);
        System.out.println(i);

        // int i=s1.compareToIgnoreCase(s2);
        // System.out.println(i);

        // int i=s1.indexOf("i");
        // System.out.println(i);

        // int j=s1.lastIndexOf("a");
        // System.out.println(j);

        // String str=s1.replace("a","o");
        // System.out.println(str);

        // String str=s1.replaceAll("[a-z]","o");
        // System.out.println(str);

        // String[] str=s1.split(" ");
        // System.out.println(str[0]);
        // System.out.println(str[1]);
        // System.out.println(str[2]);

        // String s3=" Hello World ";
        // System.out.println(s3.trim());
        // System.out.println(s3.strip());

        // System.out.println(s1.concat(s2));

        // System.out.println("".isEmpty());
        // System.out.println(" ".isEmpty());

        // System.out.println("".isBlank());
        // System.out.println(" ".isBlank());

        // System.out.println("hi".repeat(5));

        // System.out.println("123".matches("[0-9]+"));

        // int x = 100;
        // String s = String.valueOf(x);
        // System.out.println(s);

        // String h=String.join("*","a","b","c");
        // System.out.println(h);

        // String s = String.format("Age : %d", 20);
        // System.out.println(s);


        sc.close();
    }
}
