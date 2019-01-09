package shop;

public enum MemberShip {
    GOLD(25),
    SILVER(10),
    NONE(0);

    private double discounts;

    MemberShip(double discounts) {
        this.discounts = discounts;
    }

    public double getDiscounts() {
        return this.discounts;
    }
}
