public class Summer {

    int temperature = 80;

    void setTemp(int t) {
        this.temperature = t;
    }

    static Summer makeHot() {
        Summer s;
        System.out.println("Make it hot!");
        s.setTemp(100);
        return s;
    }

    static Summer makeCool() {
        Summer s;
        System.out.println("Make it cool...");
        return s;
    }

    static void setMonth(String month) {
        if (month == "June" || month == "July" || month == "August") {
            Summer s = makeHot();
            System.out.println("It's hot!");
        } else {
            Summer s = makeCool();
            System.out.println("It's cool!");
        }
    }

    public static void main(String args[]) {
        System.out.println("It's gonna be hot outside!"); 
        setMonth("June");
    }
}
