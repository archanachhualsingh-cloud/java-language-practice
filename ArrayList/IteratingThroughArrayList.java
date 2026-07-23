import java.util.ArrayList;
import java.util.Iterator;
public class IteratingThroughArrayList {
  public static void main(String[] args){
    ArrayList<String> list=new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Mango");
    for(int i=0;i<list.size();i++){
        System.out.println(i+":"+list.get(i));
    }

    // Enhanced for loop 
    for(String fruit : list){
        System.out.println(fruit);
    }

    //Using Iterator<>
    Iterator<String> it=list.iterator();
    while(it.hasNext()){
        String fruitt= it.next();
        if(fruitt.equals("Banana")){
            it.remove();
        }
    }
    System.out.println(list);
  }  
}
