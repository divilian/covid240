import java.util.ArrayList;
public class Car {

    private String make, model;
    private int milesWorthOfGas;
    Car(int mwog) {
        this.milesWorthOfGas = mwog;
    }
    public void drive(int numMiles) throws NotEnoughGasException,
        CarBrokeDownException {
        // ... stuff ...

        if (milesWorthOfGas < numMiles) {
            throw new NotEnoughGasException();
        } 
        if (2+2==5) {
            throw new CarBrokeDownException();
        }
        System.out.println("We successfully drove " + numMiles + " miles!");
    }

    public static void driveDemCars(ArrayList<Car> l) 
        throws NotEnoughGasException, CarBrokeDownException {
        for (Car c: l) {
            c.drive(10);
        }
    }

    public static void main(String args[]) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(0));
        cars.add(new Car(100));
        cars.add(new Car(100));

        try {
            driveDemCars(cars);
        } catch (Exception e1) {
            System.out.println("PUKE!!!");
        }
    }
}
