class Virus {
    
    String name;
    double virulence;

    Virus() {
        name = "unknown";
        virulence = 2.2;
    }
    Virus(String name) {
        this.name = name;
        virulence = 1.2;
    }
    Virus(double vir) {
        this.name = "unknown";
        this.virulence = vir;
    }
    Virus(String name, double vir) {
        this.name = name;
        virulence = vir;
    }
    public String toString() {
        return "a " + name + " virus with virulence " + virulence;
    }
    public static void main(String args[]) {
        Virus v = new Virus();
        Virus covid = new Virus("Covid", 5.7);
        Virus flu = new Virus("Flu");

        System.out.println("This is " + v);
        System.out.println("This is " + covid);
        System.out.println("This is " + flu);
    }
}
