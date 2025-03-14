
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copy_write_arrayList {
    public static void main(String[] args) {
//        diff between array list and copy write array list
      List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);

        Iterator<Integer> my_iterator=mylist.iterator();
        try {
            while (my_iterator.hasNext()) {
                Integer num = my_iterator.next();
                System.out.println(num);
                if (num==3)
                {
                    // This will throw a ConcurrentModificationException in ArrayList
                    mylist.add(4);      // Concurrent modification exception!

                }
            }
        }
        catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException in ArrayList!");
            e.printStackTrace();
        }

        List <Integer> copy_write_array_list_example=new CopyOnWriteArrayList<>();
        copy_write_array_list_example.add(1);
        copy_write_array_list_example.add(2);
        copy_write_array_list_example.add(3);
        Iterator<Integer> copy_iterator=copy_write_array_list_example.iterator();
        while (copy_iterator.hasNext()) {
            Integer num = copy_iterator.next();
            System.out.println(num);
            if (num==3)
            {
                // This modification is allowed in CopyOnWriteArrayList
                copy_write_array_list_example.add(4);      // No ConcurrentModificationException!
            }
        }
        System.out.println("-----------------------------------------------------------");
        for (Integer num : copy_write_array_list_example) {
            System.out.println(num);
        }


 List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(3);
        replace(list,3,6);
        for(Integer i : list)
            System.out.println(i);//*





    }
// this if we want to replace value of element in all array list
public static <E> void replace ( List<E> list,E oldvalue,E newvalue) {
        for(E val:list)
        {
            if(oldvalue.equals(val))
            {
                list.set(list.indexOf(oldvalue),newvalue);
            }

        }
}

}

