import java.util.*;

public class merge_sorted_LinkedList {
    public static void main(String[] args) {
       LinkedList<Integer> list1 = new LinkedList<>(); 
       LinkedList<Integer> list2 = new LinkedList<>(); 

       list1.add(1);
       list1.add(3);
       list1.add(5);
       list2.add(2);
       list2.add(3);
       list2.add(6);

       list1.addAll(list1.size(), list2);
       Collections.sort(list1);
       System.out.println(list1);
       
    }
}
