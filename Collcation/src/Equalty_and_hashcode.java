//import java.sql.SQLOutput;
//import java.util.Date;
//import java.util.Objects;
//
//public class Equalty_and_hashcode {
//
//
//    public static void main(String[] args) {
//        Person p1 =new Person("Mohamed","Rashed",21,new Date());
//        Person p2 =new Person("Mohamed","Rashed",21,new Date());
//        System.out.println(p1.equals(p2));
//        System.out.println("---------------------------");
//        System.out.println(p1.hashCode());
//        System.out.println("---------------------------");
//        System.out.println(p2.hashCode());
//
//
//    }
//}
//class Person
//{
//    private String fristName;
//    private String lastName;
//    private int age;
//    private Date lastModifiationDate;
//
//    public Person(String fristName, String lastName, int age, Date lastModifiationDate) {
//        this.fristName = fristName;
//        this.lastName = lastName;
//        this.age = age;
//        this.lastModifiationDate = lastModifiationDate;
//    }
//
//    public String getFristName() {
//        return fristName;
//    }
//
//    public void setFristName(String fristName) {
//        this.fristName = fristName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Date getLastModifiationDate() {
//        return lastModifiationDate;
//    }
//
//    public void setLastModifiationDate(Date lastModifiationDate) {
//        this.lastModifiationDate = lastModifiationDate;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//        {
//            return true;// if the object that bases to function is the same reference (first equality rule (reflexivity) object should te be equal to itself
//        }
//        if (o==null || this.getClass() !=o.getClass())//check the nullity rule that object is not to be Null and object should to be instance of the same class
//        {
//            return false;
//        }
//        Person other =(Person)o ;    //casting the object to be person opject
//        return this.age == other.age
//                &&Objects.equals(this.fristName, other.fristName)// use the equals methods because this is compression between strings
//                &&Objects.equals(this.lastName, other.lastName);
//
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(fristName, lastName, age);
//    }
//
//}