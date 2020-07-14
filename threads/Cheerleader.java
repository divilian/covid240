

public class Cheerleader implements Runnable {

    private String team;
    private int delay;

    Cheerleader(String team, int delay) {
        this.team = team;
        this.delay = delay;
    }

    public static void main(String args[]) {
        System.out.println("Welcome to multithreaded cheerleader program!");    

        Cheerleader jets = new Cheerleader("Jets",100);
        Cheerleader giants = new Cheerleader("Giants",0);
        Cheerleader steelers = new Cheerleader("Steelers",5);
        Thread jetst = new Thread(jets);
        Thread giantst = new Thread(giants);
        Thread steelerst = new Thread(steelers);
        jetst.start();
        giantst.start();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            System.out.println("Whoa, my main method couldn't take a nap!");
        }
        giantst.interrupt();
        try {
            jetst.join();
        } catch (InterruptedException e) {
            System.out.println("Whoa, I was waiting on Jets but guess not!");
        }
        steelerst.start();
    }

    public void run() {
        try {
            for (int i=0; i<8; i++) {
                System.out.println("Go " + team + "!");
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println("The " + team + " are CRANKY!!!");
        }
    }
}
