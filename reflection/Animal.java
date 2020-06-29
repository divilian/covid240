
abstract class Animal {

    public void makeNoise() {
        System.out.println("Growl!!");
    }

    public void move(int dist) {
        for (int i=0; i<dist; i++) {
            System.out.print("tramp ");
        }
        System.out.println();
    }
}
