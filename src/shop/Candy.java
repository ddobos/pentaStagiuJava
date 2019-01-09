package shop;

public class Candy extends Product {
    private double quantity;

    public Candy(int id, String name, double price, double quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }
}
