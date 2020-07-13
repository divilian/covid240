
import java.util.ArrayList;

public class BarbecuePicnic {
    public static void main(String args[]) {

        System.out.println("Remember to social distance, people!!");

        ArrayList<Task> tasks = new ArrayList<Task>();

        Task addBuns = new Task("Put burgers on buns",2);
        Task setTable = new Task("Set table",1);
        Task grillBurgers = new Task("Grill the burgers",4);
        Task chopVeggies = new Task("Chop veggies",2);
        Task condiments = new Task("Assemble condiments",1);
        Task lightGrill = new Task("Light the grill",1);
        Task announceReady = new Task("Announce lunch is ready!",1);
        Task grillVeggies = new Task("Grill veggies",2);

        grillBurgers.addPrereq(lightGrill);
        setTable.addPrereq(condiments);
        announceReady.addPrereq(addBuns);
        announceReady.addPrereq(grillVeggies);
        announceReady.addPrereq(setTable);
        addBuns.addPrereq(grillBurgers);
        grillVeggies.addPrereq(lightGrill);
        grillVeggies.addPrereq(chopVeggies);

        tasks.add(addBuns);
        tasks.add(announceReady);
        tasks.add(lightGrill);
        tasks.add(grillVeggies);
        tasks.add(setTable);
        tasks.add(chopVeggies);
        tasks.add(condiments);
        tasks.add(grillBurgers);

        for (Task t: tasks) {
            t.startIfStartable();
        }
    }
}
