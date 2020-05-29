


public class Game {
    public static void main(String args[]) {
        Clock c = Clock.instance();
        for (int i=0; i<7; i++) {
            c.incTime();
        }
        Clock d = Clock.instance();
        System.out.println("The time is currently " + c.getTime());

        System.out.println("c is " + c);
        System.out.println("d is " + d);
        d.incTime();
        System.out.println("The time is currently " + c.getTime());
    }
}
