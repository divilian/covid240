
public class Main {
    public static void main(String args[]) {
        Directory root = new Directory("/");
        Directory dev = new Directory("dev");
        Directory home = new Directory("home");
        Directory stephen = new Directory("stephen");
        Directory cpsc240 = new Directory("cpsc240");
        Directory cpsc284 = new Directory("cpsc284");
        Directory zork = new Directory("zork");
        Directory src = new Directory("src");
        Directory files = new Directory("files");
        Device usb = new Device("usb", true);
        File commandDotJava = new File("Command.java", 200);
        File dungeonDotJava = new File("Dungeon.java", 500);
        File gameStateDotJava = new File("GameState.java", 350);
        File matricesDotJava = new File("Matrices.java", 800);
        File trinkleDotZork = new File("trinkle.zork", 150);
        File westerosDotZork = new File("Westeros.zork", 650);
        File bogus = new File("bogus", 13);

        root.addEntry(home);
        root.addEntry(dev);
        dev.addEntry(usb);
        home.addEntry(stephen);
        stephen.addEntry(cpsc240);
        stephen.addEntry(cpsc284);
        cpsc240.addEntry(zork);
        cpsc284.addEntry(matricesDotJava);
        zork.addEntry(src);
        zork.addEntry(files);
        src.addEntry(commandDotJava);
        src.addEntry(dungeonDotJava);
        src.addEntry(gameStateDotJava);
        files.addEntry(bogus);
        files.addEntry(trinkleDotZork);
        files.addEntry(westerosDotZork);


        System.out.println("My Zork project consumes " + zork.size() + " bytes.");
        System.out.println("My Command.java file consumes " + commandDotJava.size() + " bytes.");
        System.out.println("My whole filesystem is " + root.size() + " bytes.");

        if (zork.matches(".zork")) {
            System.out.println("Yes, the zork project contains at least one .zork file!");
        } 
        if (cpsc284.matches(".zork")) {
            System.out.println("Yes, CPSC 284 contains at least one .zork file!");
        } 
        if (root.matches(".zork")) {
            System.out.println("Yes, the filesystem contains at least one .zork file!");
        } 
    }
}
