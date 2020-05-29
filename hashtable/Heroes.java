
import java.util.Hashtable;

public class Heroes {
    public static void main(String args[]) {

        Hashtable<String,String> alterEgos = new Hashtable<String,String>();
        alterEgos.put("Superman","Clark Kent");
        alterEgos.put("Batman","Bruce Wayne");
        alterEgos.put("Elastigirl","Helen Incredible");

        alterEgos.put("Batman","Rich Guy");

        System.out.println("Superman is really " + alterEgos.get("Superman"));
        System.out.println("Elastigirl is really " + alterEgos.get("Elastigirl"));
        System.out.println("Batman is really " + alterEgos.get("Batman"));
        System.out.println("Spiderman is really " + alterEgos.get("Spiderman"));
        if (alterEgos.contains("Spiderman")) {
            System.out.println("yes!");
        } else {
            System.out.println("no!");
        }


    }
}
