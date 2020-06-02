
class Car {

    String make;
    String model;
    int yearsOld;
    int odo;
    double galsRemaining, sizeOfTank, gasMileage;
    static int num = 0;

    boolean isOlderThan(Car c) {
        if (this.yearsOld > c.yearsOld) {
            return true;
        } else {
            return false;
        }
    }

    
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.yearsOld = 0;
        this.odo = 0;
        if (this.make.equals("Chevy") || this.make.equals("GM")) {
            this.sizeOfTank = 25;
            if (model.equals("Malibu")) {
                this.gasMileage = 3;
            } else {
                this.gasMileage = 25;
            }
        } else {
            this.gasMileage = 25;
            this.sizeOfTank = 12;
        }
        this.galsRemaining = this.sizeOfTank;
        num++;
    }

    static int numCars() {
        return num;
    }

    String getMake() {
        return this.make;
    }    

    String getModel() {
        return this.model;
    }    

    void fillUp() {
        this.galsRemaining = this.sizeOfTank;
        return;
    }

    double getTankPerc() {
        double tankPerc = this.galsRemaining / sizeOfTank * 100;
        return tankPerc;
    }

    void drive(int numMiles) throws Exception {
        double numGallonsRequired = numMiles / this.gasMileage;
        if (numGallonsRequired > this.galsRemaining) {
            throw new Exception("Not enough gas!!");
        }
        this.galsRemaining -= numGallonsRequired;
        this.odo += numMiles;
    }
 
    public String toString() {
        return make + " " + model + " with " + galsRemaining +
            " gallons in the tank";
    }

    public boolean equals(String s) {
        if (this.make.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Car c) {
        if (this.odo == c.odo) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Car ferrari = new Car("Ferrari","FX243");
        Car ferrari2 = new Car("Ferrari","FX243");
        Car ferrari3 = ferrari2;
        Car jaguar = new Car("Jaguar","J");

        if (ferrari.equals(jaguar)) {
            System.out.println("Identical cars!");
        } else {
            System.out.println("NOT identical cars!");
        }
        if (ferrari.equals("Ferrari")) {
            System.out.println("Identical cars!");
        } else {
            System.out.println("NOT identical cars!");
        }
/*
        ferrari.yearsOld = 5;
        jaguar.yearsOld = 11;

        if (ferrari.isOlderThan(jaguar)) {
            System.out.println("The Ferrari is older.");
        } else {
            System.out.println("The Ferrari is NOT older.");
        }

        System.out.println("There are now " + Car.numCars() + " cars.");
        Car bigLoudGuysCar = new Car("GM", "Oldsmobile");
        System.out.println("There are now " + Car.numCars() + " cars.");
        Car stephensCar = new Car("Chevy", "Malibu");
        System.out.println("There are now " + Car.numCars() + " cars.");

        System.out.println("At the start, before any drives, I have these two cars:");
        System.out.println(bigLoudGuysCar);
        System.out.println(stephensCar);
        System.out.println("----------------------");
        try {
            System.out.println("About to drive BLGC 50 miles.");
            bigLoudGuysCar.drive(50);
            System.out.println("About to drive BLGC 50000 miles.");
            bigLoudGuysCar.drive(50000);
            System.out.println("About to drive stephensCar 5 miles.");
            stephensCar.drive(5);
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Big Loud Guy drives a " + bigLoudGuysCar);
        System.out.println("Stephen drives a " + stephensCar);
*/
    }

}
