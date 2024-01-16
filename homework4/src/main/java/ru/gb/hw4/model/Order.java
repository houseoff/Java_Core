package ru.gb.hw4.model;

import lombok.Getter;
import lombok.EqualsAndHashCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Getter
@EqualsAndHashCode(callSuper = true)
public class Order extends ShopElement {
    private final Customer customer;
    private final Product product;
    private final String datetime;

    public Order(int id, Customer customer, Product product) {
        this.id = id;
        this.customer = customer;
        this.product  = product;
        this.datetime = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    @Override
    public String toString() {
        return "Order(" +
                "ID=" + getId() +
                ", customer=" + customer.getName() +
                ", product=" + product.getName() +
                ", datetime='" + datetime + '\'' +
                ')';
    }
}
