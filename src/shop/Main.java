package shop;

import com.sun.org.apache.xerces.internal.impl.dtd.DTDGrammarBucket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book(1, "book01", 5.45, "Author01"));
        products.add(new Book(2, "book02", 15, "Author01"));
        products.add(new Book(3, "book03", 51.05, "Author01"));
        products.add(new Book(4, "book04", 7.55, "Author01"));
        products.add(new Book(5, "book05", 9.99, "Author01"));
        products.add(new Candy(6, "candy06", 21.22, 4));
        products.add(new Candy(7, "candy07", 1, 1));
        products.add(new Candy(8, "candy08", 25.99, 7));
        products.add(new Candy(9, "candy09", 11.99, 9));
        products.add(new Candy(10, "candy10", 79, 12));
        //add Customer
        Customer myCustomer = new Customer(1, "customer1");
        Backet backet = new Backet(1, myCustomer);
        backet.setProduct(products.get(0));
        System.out.println(String.format("total pret : %f, reducere : %f, Spre plata %f",backet.getTotal() , backet.infoDiscount(), backet.getTotal() - backet.infoDiscount()));
        backet.setProduct(products.get(3));
        System.out.println(String.format("total pret : %f, reducere : %f, Spre plata %f",backet.getTotal() , backet.infoDiscount(), backet.getTotal() - backet.infoDiscount()));
        myCustomer.setMemberShip(MemberShip.GOLD);
        System.out.println("ati optinut un discount de : " + myCustomer.getMemberShip().getDiscounts() + "%");
        System.out.println(String.format("total pret : %f, reducere : %f, Spre plata %f",backet.getTotal() , backet.infoDiscount(), backet.getTotal() - backet.infoDiscount()));


    }
}
