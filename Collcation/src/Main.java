public class Main {
    public static void main(String[] args) {
        String a = "Rashed";
        String b = "Rashed";

        if (a.equals(b)) {   //checking the equality of objects using equals() methods
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " " + a.hashCode() + " & " + b.hashCode());

        }


        String c = "Rashed";
        String d = "rashed";

        if (!c.equals(d)) {    //checking  the equality of objects using equals() method
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " " + c.hashCode() + " & " + d.hashCode());
        }

    }
}
