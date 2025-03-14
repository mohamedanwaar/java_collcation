
import java.sql.SQLOutput;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {


        ArrayList<String> pepole=new ArrayList<>();
        pepole.add("Rashed");
        pepole.add("Mohamed");
        pepole.add("Rashed");
        for (String name : pepole)
        {
            System.out.println(name);
        }
        ArrayList<String> pepole2=new ArrayList<>();
        pepole2.add("Atlam");
        pepole2.add("Elmanyary");
        pepole.addAll(pepole2);
        System.out.println("--------------------------");
        pepole.addFirst("atta");    // this is O(N)  because we should
        for (String name : pepole)
        {
            System.out.println(name);
        };
//*


        LinkedList<Book> books=new LinkedList<>();
        books.add(new Book(1,"java oop","Rashed","amazon",10));
        books.add(new Book(2,"C++","Mohamed","we",50));
        books.add(new Book(3,"java oop","Rashed","amazon",55));
        books.add(new Book(4,"c#","Ahamed","wrwr",54));
        System.out.println("-------------------------------------------------------------------");
        Book p1=new Book(12,"java oop","Rashed","amazon",100);
        System.out.println( books.get(0).equals(p1));   // this is return true
        System.out.println("-------------------------------------------------------------------");
        System.out.println( books.get(1).equals(p1));    // this is retuen false
        System.out.println("-------------------------------------------------------------------");
        books.remove(p1);    // this is comper p1 object comper where as name and author and publisher only
           for (Book b:books)
           {
               System.out.println(b);  // we shoud create to string method in book class
           }
        System.out.println("------------------------------------------------------------------");

       // if we want to sort books based on quantity we do compartor class
        Collections.sort(books,new QuantityComparator());   // this is comper based on quantity
        for (Book b:books)
        {
            System.out.println(b);  // we shoud create to string method in book class
        }








            }


}


class QuantityComparator implements Comparator {
    public int compare(Object o1,Object o2){
        Book b1=(Book)o1;
        Book b2=(Book)o2;
        return Integer.compare(b2.getQuantity(),b1.getQuantity());
    }

}


