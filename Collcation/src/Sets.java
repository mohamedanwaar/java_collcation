import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("c");
        set.add("a");
        set.add("b");
        // here hasset dont care for the insertion order
        // this insertion order is c--->a---->b
        // when be print the output is a b c (dosent care about insertion order )
        Iterator<String>itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("---------------------------");
        System.out.println(set.isEmpty());
        System.out.println("---------------------------");
        System.out.println(set.contains("c"));
        System.out.println("---------------------------");
        System.out.println(set.size());


        //if we need for the insertion order we use linkedHashset
        System.out.println("---------------------------");
        Set<String> linkedSet = new LinkedHashSet<String>();
        linkedSet.add("c");
        linkedSet.add("a");
        linkedSet.add("b");
        // here this is print as ew insert elemnt
        //c
        //a
        //b
        for (String s : linkedSet) {
            System.out.println(s);
        }
        System.out.println("___________________________________________________________________________________");

        // THIS IS natural sorting (tree set)
        SortedSet <String> vocap=new TreeSet<>();
        vocap.add("banana");
        vocap.add("pineapple");
        vocap.add("apple");
        vocap.add("mango");
        System.out.println("vocap = " + vocap);
        System.out.println(vocap.headSet("mango"));
        System.out.println(vocap.tailSet("mango"));
        System.out.println("-------------------------------------------------------------------------------------");
        //----------------------------------------------------------------------------------------------------
        NavigableSet<LocalDateTime> time=new TreeSet<>();
        time.add(LocalDateTime.of(2024,3,4,10,15));
        time.add(LocalDateTime.of(2024,3,4,10,45));
        time.add(LocalDateTime.of(2024,3,4,10,30));
        time.add(LocalDateTime.of(2024,3,4,11,0));
        time.add(LocalDateTime.of(2024,3,4,11,30));
        time.add(LocalDateTime.of(2024,3,4,12,0));
        //Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        LocalDateTime beforeappent=time.floor(LocalDateTime.of(2024,3,4,10,45));
        System.out.println("beforeappent = " + beforeappent);    //2024-03-04T10:45
        System.out.println("--------------------------------------------------------------------------------");
        //Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        LocalDateTime before_withNoEqual=time.lower(LocalDateTime.of(2024,3,4,10,45));
        System.out.println("before_withNoEqual = " + before_withNoEqual);
        System.out.println("--------------------------------------------------------------------------------");
        //Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        LocalDateTime nextappent=time.ceiling(LocalDateTime.of(2024,3,4,10,45));
        System.out.println("nextappent = " + nextappent);
        System.out.println("---------------------------------------------------------------------------");
        //Returns the least element in this set strictly greater than the given element, or null if there is no such element.
        LocalDateTime afterappentwithNOEqualk=time.higher(LocalDateTime.of(2024,3,4,10,45));
        System.out.println("afterappentwithNOEqualk = " + afterappentwithNOEqualk);



    }
}
