import java.util.HashMap;
import java.util.Objects;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<Key,Value> myHashMap = new HashMap();
        myHashMap.put(new Key(1),new Value("Mohamed"));
        myHashMap.put(new Key(2),new Value("Rashed"));
        System.out.println(myHashMap);
        System.out.println("--------------------------------");
        System.out.println(myHashMap.containsKey(new Key(2)));// this we should override the equal method in the key class
        // without override equal method the output is false
        ///////////////////////////////////////////////////////////////////////////
        System.out.println("--------------------------------");
        System.out.println(myHashMap.get(new Key(2)));
        System.out.println("--------------------------------");
        System.out.println(myHashMap.containsValue(new Value("Rashed")));
    }
}

class Key
{
    private int key;

    Key (int key)
    {
        this.key = key;
    }


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Key{" +
                "key=" + key +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return key == key1.key;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }
}
class Value
{
    private String value;

    Value(String value)
    {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return Objects.equals(value, value1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}