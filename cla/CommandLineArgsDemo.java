
public class CommandLineArgsDemo {
    public static void main(String args[]) {
        if (args.length > 0) {
            System.out.println("We're going to play the " + args[0] +
                " dungeon!");
        } else {
            System.out.println("Usage: CommandLineArgsDemo zorkDungeonFile.");
        }
    }
}
