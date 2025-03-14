import java.util.HashMap;

public class InterviewQ {
    // we want to find item in common between two arrays
    public static boolean itemIncomman_usinfNasedLooop(int []array1,int []array2){
        for(int i : array1)
        {
            for (int j : array2)
                if(i == j) return true;
        }
        return false;

    }
    public static boolean itemIncomman_usinfHashTablw(int []array1,int []array2){
        HashMap<Integer,Boolean> myHash = new HashMap();
        for (int i:array1)
        {
            myHash.put(i,true);
        }
        for (int j:array2)
        {
            if (myHash.get(j) != null) return true;
        }
        return false;


    }

}
