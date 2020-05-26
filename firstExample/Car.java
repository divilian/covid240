
class Car {

    String make;
    String model;
    int yearsOld;
    int odo;
    double galsRemaining, sizeOfTank, gasMileage;
    static int num = 0;

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

    boolean drive(int numMiles) {
        double numGallonsRequired = numMiles / this.gasMileage;
        if (numGallonsRequired > this.galsRemaining) {
            return false;
        }
        this.galsRemaining -= numGallonsRequired;
        this.odo += numMiles;
        return true;
    }
 
    public String toString() {
        return make + " " + model + " with " + galsRemaining +
            " gallons in the tank";
    }

    public static void main(String args[]) {
        System.out.println("There are now " + Car.numCars() + " cars.");
        Car bigLoudGuysCar = new Car("GM", "Oldsmobile");
        System.out.println("There are now " + Car.numCars() + " cars.");
        Car stephensCar = new Car("Chevy", "Malibu");
        System.out.println("There are now " + Car.numCars() + " cars.");
        bigLoudGuysCar.drive(50);
        stephensCar.drive(5);
        System.out.println("Big Loud Guy drives a " + bigLoudGuysCar);
        System.out.println("Stephen drives a " + stephensCar);
    }

}
