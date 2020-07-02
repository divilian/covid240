
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterSmaller {





private static void printMsg(String verb,
    Iterator<String> names) {

    while (names.hasNext()) {
        System.out.println("I " + verb + " " +
        names.next() + "!");
    }
}


public static void main(String args[]) {

    String[] band_data = { "The Beatles", "Led Zeppelin",
        "The Who", "Creedence Clearwater Revival" };

    
    Iterator<String> ringo = bands.iterator();
    System.out.println(ringo.next() + " did drugs");
    Iterator<String> starr = bands.iterator();
    System.out.println(ringo.next() + " did drugs");
    printMsg("listen to", starr);
    System.out.println(ringo.next() + " did drugs");
}














}




