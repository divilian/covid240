
import java.util.ArrayList;

public class CountUniqueArrayList extends ArrayList {

    public int countUnique() {
        java.util.HashSet hs = new java.util.HashSet();
        hs.addAll(this);
        return hs.size();
    }

    public static void main(String args[]) {
        CountUniqueArrayList n = new CountUniqueArrayList();
        n.add("Harry");
        n.add("Ron");
        n.add("Hermione");
        n.add("Harry");
        n.add("Harry");
        n.add("Dumbledore");
      
        System.out.println(n.get(3));         // prints "Harry"
        System.out.println(n.size());         // prints 6
        System.out.println(n.countUnique());  // prints 4
    }
}
