import java.util.ArrayList;

public class Hashtable {
    private int size=7;
    private Node[] table;


    class Node {
        String Key;
        int Value;
        Node Next;
        public Node(String key, int value) {
            this.Key = key;
            this.Value = value;
        }

    }
    Hashtable() {
        table=new Node[size];  // this is create array with size is 7 and reference to nodes (linked list )

    }

    private int hash(String key) {
        int hash=0;
        char[] keychar =key.toCharArray();
        for (char ch : keychar) {
            int asciichar=(int)ch;
            hash=(hash*23+asciichar)%table.length;
        }
        return hash;
    }

    public void put(String key, int value) {
        int index=hash(key);
        Node newNode=new Node(key,value);
        if (table[index]==null)
        {
            table[index]=new Node(key,value);
        }
        // this to find the last node to put new node after this
        else
        {
            Node temp=table[index];
            while (temp.Next!=null)
            {
                temp=temp.Next;
            }
            temp.Next=newNode;
        }
    }

    public int get ( String key )
    {
        Node temp=table[hash(key)];
        while(temp.Next!=null)
        {
          if(temp.Key.equals(key))
              return temp.Value;
          temp=temp.Next;
        }
        return 0;   // if the key is not found


    }
    public ArrayList Keys(){
        ArrayList keylist=new ArrayList();
        for (int i=0;i<table.length;i++)
        {
            Node temp=table[i];
            while (temp!=null)
            {
                keylist.add(temp.Key);
                temp=temp.Next;
            }
        }
        return keylist;

    }




}
