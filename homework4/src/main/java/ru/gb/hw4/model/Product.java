package ru.gb.hw4.model;

import lombok.Getter;
import lombok.EqualsAndHashCode;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Product extends ShopElement {
    public static int MAX_QUANTITY = 100;
    public static double MIN_PRICE = 10.0;

    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public Product(int id, String name) {
        this(id, name, 0, 0);
    }

    public void setName(String name) {
        this.name = name.trim().toLowerCase();
    }

    public void setPrice(double price) {
        this.price = Math.max(MIN_PRICE, price);
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(Math.min(quantity, Product.MAX_QUANTITY), 1);
    }

    @Override
    public String toString() {
        return "Product(" +
                "ID=" + getId() +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ')';
    }
}
