
abstract class Item {

    protected double basePrice;

    double getPrice() {
        return basePrice;
    }

    void setPrice(double p) {
        basePrice = p;
    }

    boolean isPerishable() {
        return false;
    }
}
