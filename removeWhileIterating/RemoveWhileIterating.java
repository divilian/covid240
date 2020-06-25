
import java.util.ArrayList;

public class RemoveWhileIterating {
    
    public static void main(String args[]) {
        ArrayList<String> beatles = new ArrayList<String>();
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("Ringo");
        beatles.add("George");

        System.out.println("beatles has " + beatles.size() + " people.");

/*
        INCORRECT solution #1:
  
        for (String b: beatles) {
            System.out.println("Bye-bye " + b + "!");
            beatles.remove(0); 
        }
*/

/*
        INCORRECT solution #2:
  
        for (int i=0; i<beatles.size(); i++) {
            System.out.println("Bye-bye " + beatles.get(i) + "!");
            beatles.remove(i); 
        }
*/

        
/*
        Correct solution #1:
  
        while (!beatles.isEmpty()) {
            System.out.println("Bye-bye " + beatles.get(0) + "!");
            beatles.remove(0); 
        }
*/

/*
        Correct solution #2:

        ArrayList<String> beatlesClone = (ArrayList<String>) beatles.clone();

        for (String b: beatlesClone) {
            System.out.println("Bye-bye " + b + "!");
            beatles.remove(b);
        }
*/

        System.out.println("beatles has " + beatles.size() + " people.");
    }
}
