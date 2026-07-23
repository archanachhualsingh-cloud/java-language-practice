import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListDiferentMethods {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Cherry");
        list.add("Banana");
        System.out.println(list);
        
        list.add(2,"Coconut");
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.size());

        list.remove(4);
        System.out.println(list);
        
        list.add(2,"Banana");
        list.add(0,"Banana");
        System.out.println(list);

        // list.remove("Banana");
        // System.out.println(list);

        System.out.println(list.indexOf("Banana"));
        System.out.println(list.lastIndexOf("Banana"));

        System.out.println(list.isEmpty());

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        ArrayList<Integer> nums1=new ArrayList<>(java.util.Arrays.asList(1,2,3,4,5,6));
        nums1.remove(0);
        System.out.println(nums1);
        nums1.remove(Integer.valueOf(3));
        System.out.println(nums1);
        nums1.clear();
        System.out.println(nums1.isEmpty());
        System.out.println(nums1.size());

         ArrayList<Integer> nums2=new ArrayList<>(java.util.Arrays.asList(10,20,30,40,50,60));
         List<Integer> sub=nums2.subList(1,4);
         System.out.println(sub);

         Integer[] arr= nums2.toArray(new Integer[0]);
         System.out.println(java.util.Arrays.toString(arr));
    }
}
