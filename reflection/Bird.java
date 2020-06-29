
class Bird extends Animal {

    public void makeNoise() {
        System.out.println("Tweet");
    }

    public void move(int dist) {
        for (int i=0; i<dist+2; i++) {
            System.out.print("flap ");
        }
        System.out.println();
    }
}
