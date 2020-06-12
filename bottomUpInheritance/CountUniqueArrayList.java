
import java.util.ArrayList;

public class CountUniqueArrayList<Brian> extends ArrayList<Brian> {

    public int countUnique() {
        java.util.HashSet<Brian> hs = new java.util.HashSet<Brian>();
        hs.addAll(this);
        return hs.size();
    }


    public static void main(String args[]) {
        CountUniqueArrayList<Integer> n = new CountUniqueArrayList<Integer>();
        n.add(13);
        n.add(23);
        n.add(27);
        n.add(13);
        n.add(14);
      
        System.out.println(n.get(3));         // prints "Harry"
        System.out.println(n.size());         // prints 6
        System.out.println(n.countUnique());  // prints 4
    }
}
