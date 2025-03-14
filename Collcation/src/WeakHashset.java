import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashset {
    public static void main(String[] args) {
        //1. Strong Reference
        String strongRef = new String("Hello, Java!"); // Strong referenc
        System.gc(); // Request garbage collection
        System.out.println(strongRef); // Not null, will print "Hello, Java!"

        String str = new String("Hello, Soft Reference!");
        SoftReference<String> softRef = new SoftReference<>(str);

        str = null; // Remove strong reference

        System.gc(); // Request GC, but it may not remove soft references immediately
        System.out.println("--------------------------------------------------------");

        if (softRef.get() != null) {
            System.out.println("Soft Reference still holds: " + softRef.get());
        } else {
            System.out.println("Soft Reference has been garbage collected.");
        }
        System.out.println("--------------------------------------------------------");
        String str2 = new String("Hello, Weak Reference!");
        WeakReference<String> weakRef = new WeakReference<>(str2);

        str2 = null; // Remove strong reference

        System.gc(); // Request GC, likely to remove weak references

        if (weakRef.get() != null) {
            System.out.println("Weak Reference still holds: " + weakRef.get());
        } else {
            System.out.println("Weak Reference has been garbage collected.");
        }

//------------------------------------------------------------------------------------------------------------
       /* ArrayList<int[]> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new int[1_000_000]); // Allocate large arrays
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred!");
        }
        list.clear();
        System.gc(); // Request GC

        System.out.println("List cleared and GC requested.");*/

        //----------------------------------------------------------------------------------------------\
         // different between hashmap and weakHashMap
        HashMap<String, Integer> numbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("HashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("HashMap after garbage collection: " + numbers);
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("-------------------------------------------------------------------------");
        WeakHashMap<String, Integer> numbers_using_weak = new WeakHashMap<>();

        String two2 = new String("Two");
        Integer twoValue2 = 2;
        String four2 = new String("Four");
        Integer fourValue2 = 4;

        // Inserting elements
        numbers_using_weak.put(two2, twoValue2);
        numbers_using_weak.put(four2, fourValue2);
        System.out.println("WeakHashMap: " + numbers_using_weak);

        // Make the reference null
        two2 = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + numbers_using_weak);


    }

}
