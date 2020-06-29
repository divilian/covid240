
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String args[]) {
        ArrayList<Animal> zoo = new ArrayList<Animal>();

        Scanner input = new Scanner(System.in);
        System.out.print("What animal would you like? ");
        String type = input.nextLine();
        while (!type.equals("done")) {

            Animal a = null;
            try {
                Class clazz = Class.forName(type);
                a = (Animal) clazz.newInstance();
                a.makeNoise();
                zoo.add(a);
            } catch (Exception e) {
                System.out.println("Couldn't make a " + type + "!");
            }
            System.out.print("What animal would you like? ");
            type = input.nextLine();
        }

        evacuate(zoo);
    }

    private static void evacuate(ArrayList<Animal> zoo) {
        for (Animal a: zoo) {
            a.move(8);
        }
    }
}
