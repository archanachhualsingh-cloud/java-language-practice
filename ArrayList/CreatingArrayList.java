import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>(); // Creates a list with initial  capacity 10(resizable)
        System.out.println(list1);

        ArrayList<Integer> list2=new ArrayList<Integer>(50);
        list2.add(34);
        System.out.println(list2);
             
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(23);
        list3.add(45);
        list3.add(67);
        System.out.println(list3);
        ArrayList<Integer> list4=new ArrayList<>(list3);
        System.out.println(list4);

        ArrayList<Integer> list5 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        System.out.println(list5);

        List<String> list6=List.of("a","b","c");
        System.out.println(list6);

        ArrayList<String> list7=new ArrayList<>(List.of("a","b","c"));
        System.out.println(list7);
    }
}