import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Comparator_and_Comparable {
    public static void main(String[] args) {

        ArrayList<Person> al=new ArrayList<Person>();
        al.add(new Person("Mohamed",23));
        al.add(new Person("Rashed",21));
        al.add(new Person("Ahmed",27));
        Collections.sort(al);     // now we can use sort for this collaction the sort is sored based on age because the compare that i implement (i implemnt it to compare based on age )
        System.out.println("this using compare to that is in person class and this is compare passed on age");
        System.out.println("-------------------------------");
        for(Person p:al){
            System.out.println(p.getName()+" "+p.getAge());
        }

        // no if we need to sort based on name we use this
        Collections.sort(al,new Compare_Name_based() );
        System.out.println("-------------------------------");
        System.out.println("this is using comparator class (Compare_Name_based) that i make  ");
        for(Person p:al){
            System.out.println(p.getName()+" "+p.getAge());
        }


    }
}

//we create Person claas that implement Comparable interface to we must declare compareto fun in this class
class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Person other)
    {

        // this is basic compar
    if(age==other.age)
            return 0;
        else if(age>other.age)
            return 1;
        else
            return -1;

// we cant use the compare fun this is static methon in the integer class

    }

}


class Compare_Name_based implements Comparator<Person>{
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }

}
///////////////////////////////////////////////////////////////////////
// this if we dont using genrics like class in above
class NameComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Person s1=(Person)o1;
        Person s2=(Person)o2;

        return s1.getName().compareTo(s2.getName());
    }

    class Compare_Age_based implements Comparator<Person>{
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }

}
}