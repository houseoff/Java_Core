package ru.gb.hw4.model.service;

import ru.gb.hw4.model.*;
import ru.gb.hw4.model.exceptions.AmountException;
import ru.gb.hw4.model.exceptions.CustomException;

import java.util.ArrayList;

public class ShopService {
    private Shop shop;
    private final IDMaker cIdMaker = new IDMaker(2);
    private final IDMaker pIdMaker = new IDMaker(5);
    private final IDMaker oIdMaker = new IDMaker();


    public static Shop createTestShop() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Ben", "1111"));
        customers.add(new Customer(2, "Tina", "f", 20, "2222"));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "toy", 10.0, 2));
        products.add(new Product(2, "bucket"));
        products.add(new Product(3, "pen"));
        products.add(new Product(4, "apple"));
        products.add(new Product(5, "glass"));

        return new Shop(customers, products, new ArrayList<>());
    }

    public ShopService() {
        this.shop = new Shop();
    }

    public void setShop() {
        this.shop = createTestShop();
    }

    public String makePurchase(String customerName, String productName, int quantity) {
        try {
            int diff = shop.getProductQuantity(productName) - quantity;
            if (diff < 0) throw new AmountException(
                    "Указанное кол-во товара превышает возможное на " + -1 * diff + " ед.");

            int customerIndex = shop.getIndexByCustomerName(customerName);
            int productIndex  = shop.getIndexByProductName(productName);
            Customer customer = shop.getCustomers().get(customerIndex);
            Product product   = shop.getProducts().get(productIndex);
            shop.addOrder(new Order(oIdMaker.getId(), customer, product));

            if (diff == 0) shop.removeShopElement(productIndex, shop.getProducts());
            else product.setQuantity(product.getQuantity() - quantity);


            return "Покупка совершена успешно";
        } catch (CustomException e) {
            return e.toString();
        }
    }

    public boolean isEmptyShop() {
        return shop.isEmpty();
    }

    public String getCustomersToString() {
        try {
            return shop.getCustomersToString();
        } catch (CustomException e) {
            return e.toString();
        }
    }

    public String getProductsToString() {
        try {
            return shop.getProductsToString();
        } catch (CustomException e) {
            return e.toString();
        }
    }

    public String getOrdersToString() {
        try {
            return shop.getOrdersToString();
        } catch (CustomException e) {
            return e.toString();
        }
    }

    public String getSalesCount() {
        return String.valueOf(shop.getOrders().size());
    }

    public String congratulation(String date) {
        return (shop.congratulation(date).isEmpty()) ? "Сегодня " + date : shop.congratulation(date);
    }
}
