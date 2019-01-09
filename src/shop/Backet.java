package shop;

import java.util.ArrayList;
import java.util.List;

public class Backet {
    private int id;
    private List<Product> products;
    private Customer customer;
    private double total;

    public Backet(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products.addAll(products);
        this.total = getTotal();
    }

    public void setProduct(Product product) {
        this.products.add(product);
        this.total = updateTotal();
    }

    private double updateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public double getTotal() {
        return total;
    }

    public double infoDiscount() {
        return this.total * (customer.getMemberShip().getDiscounts() / 100);
    }
}
