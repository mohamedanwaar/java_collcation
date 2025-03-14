

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.Scanner;

public class IteratorExample {
    public static void main(String[] args) {
        // get the fruits from user and put it in the arraylist and print it
        Scanner in = new Scanner(System.in);
        FruitSuplier fs = new FruitSuplier();

        for (int i = 0; i <5 ; i++) {
            String fruit = in.nextLine();
            fs.add(fruit);
        }
        // to print tha items in the collection we use the iterator interface
        Collection<String> frutes=fs.getfruts();
        System.out.println(frutes);   // this is reurn as lint if we print each elemnt in lisrt we use the iteratror
        System.out.println("------------------------------------");
        ///////////////////////////////////////////////////////////////////
        // this is using iterator interface
        Iterator<String> iterator=frutes.iterator();
        while(iterator.hasNext()){
            String fruitString=iterator.next();
            if(fruitString.equals("apple"))
            {
                iterator.remove();
            }
            //this is return noElementException
            System.out.println(iterator.next());
        }

       /////////////////////////////////////////////////////////////////////

//        //this is simple syntax ///print aftar remove banana
//        for (String frute : frutes) {
//            System.out.println(frute);
//        }


    }
}


class FruitSuplier
{

    ArrayList<String> fruties = new ArrayList<String>();
    public FruitSuplier() {

    }

     public Collection<String> getfruts()
             {
                 return fruties;
             }

     public void add(String fruit)
    {
        fruties.add(fruit);
    }
}


