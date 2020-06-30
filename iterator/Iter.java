
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Arrays;

public class Iter {

    // Demonstrating a function that iterates through a collection of items,
    // yet is agnostic with respect to what particular type of collection it
    // is:
    private static void printMsg(String verb, Iterator<String> names) {
        while (names.hasNext()) {
            System.out.println("I " + verb + " " + names.next() + "!");
        }
    }


    public static void main(String args[]) {

        // We can use our function to iterate through an ArrayList...
        ArrayList<String> fam = new ArrayList<String>();
        fam.add("Rae");
        fam.add("Lizzy");
        fam.add("TJ");
        fam.add("Johnny");
        fam.add("Smokey");
        fam.add("Penny");
        printMsg("love", fam.iterator());

        // ...or an array...
        String[] students = { "Duck Hunt", "Young-Drei", "MCiv", "Catwoman" };
        printMsg("teach", Arrays.asList(students).iterator());

        // ...or a HashSet...
        Set<String> activities = new HashSet<String>();
        activities.add("martial arts");
        activities.add("videogames");
        activities.add("videogames");
        activities.add("videogames");
        activities.add("running");
        activities.add("videogames");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        activities.add("biking");
        printMsg("do", activities.iterator());        

        // ...or a HashTable (either keys or values).
        Hashtable<String,String> heroes = new Hashtable<String,String>();
        heroes.put("Bruce Wayne","Batman");
        heroes.put("Diana","Wonder Woman");
        heroes.put("Tony Stark","Iron Man");
        heroes.put("Bruce Banner","Hulkster");
        printMsg("admire", heroes.values().iterator());
        printMsg("am acquainted with", heroes.keySet().iterator());

        // (can also iterate through a Stack, a PriorityQueue, a set of
        // TreeNodes, and so forth.)


        // Demonstrating simultaneous iterators on the same collection that do
        // not interfere with each other:
        Iterator<String> i = fam.iterator();
        System.out.println("Do your chores, " + i.next() + "!");
        System.out.println("Do your chores, " + i.next() + "!");
        printMsg("love", fam.iterator());
        System.out.println("Do your chores, " + i.next() + "!");
        System.out.println("Do your chores, " + i.next() + "!");
        
    }
}
