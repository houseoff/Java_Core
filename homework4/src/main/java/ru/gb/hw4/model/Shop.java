package ru.gb.hw4.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import lombok.Getter;
import ru.gb.hw4.model.exceptions.CustomerException;
import ru.gb.hw4.model.exceptions.EmptyCollection;
import ru.gb.hw4.model.exceptions.ProductException;

@Getter
public class Shop {
    private final ArrayList<Customer> customers;
    private final ArrayList<Product> products;
    private final ArrayList<Order> orders;

    public Shop() {
        customers = new ArrayList<>();
        products  = new ArrayList<>();
        orders    = new ArrayList<>();
    }

    public Shop(ArrayList<Customer> customers, ArrayList<Product> products, ArrayList<Order> orders) {
        this();
        if (!customers.isEmpty()) this.customers.addAll(customers);
        if (!products.isEmpty())  this.products.addAll(products);
        if (!orders.isEmpty())    this.orders.addAll(orders);
    }

    private String getCollectionToString(Collection<?> c, String delimiter) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (var e : c) {
            counter++;
            sb.append(e);
            if (counter != c.size()) sb.append(delimiter);
        }
        return sb.toString();
    }

    private String getCollectionToString(Collection<?> c) {
        return getCollectionToString(c, "\n");
    }

    private List<String> getCustomersNamesByGender(String gender) {
        return customers.stream()
                .filter(e -> e.getGender().toString().equals(gender))
                .map(Customer::getName)
                .toList();
    }

    private List<String> getCustomersNames() {
        return customers.stream()
                .map(Customer::getName)
                .toList();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getCustomersToString() throws EmptyCollection {
        if (customers.isEmpty()) throw new EmptyCollection("Список покупателей пуст");
        return getCollectionToString(customers);
    }

    public int getIndexByCustomerName(String customerName) throws CustomerException {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) return i;
        }
        throw new CustomerException("Покупатель с именем \"" + customerName + "\" не найден");
    }

    public int getIndexByProductName(String productName) throws ProductException {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(productName)) return i;
        }
        throw new ProductException("Продукт с именем " + productName + " не найден");
    }

    public String getOrdersToString() throws EmptyCollection {
        if (orders.isEmpty()) throw new EmptyCollection("Список заказов пуст");
        return getCollectionToString(orders);
    }

    public int getProductQuantity(String productName) throws EmptyCollection, ProductException {
        if (products.isEmpty()) throw new EmptyCollection("Список продуктов пуст");
        for (var product : products) {
            if (product.getName().equals(productName.toLowerCase()))
                return product.getQuantity();
        }
        throw new ProductException("Товар с именем \"" + productName + "\" отсутствует");
    }

    public String getProductsToString() throws EmptyCollection {
        if (products.isEmpty()) throw new EmptyCollection("Список продуктов пуст");
        return getCollectionToString(products);
    }

    public boolean isEmpty() {
        return customers.isEmpty() && products.isEmpty() && orders.isEmpty();
    }

    public void removeShopElement(int index, ArrayList<? extends ShopElement> list) {
        list.remove(index);
    }

    public String congratulation(String date) {
        List<String> names = new ArrayList<>();
        String msg = "";

        if (date.equals(Holiday.MEN_DAY.getDayOfHoliday())) {
            names = getCustomersNamesByGender("m");
            msg   = Holiday.MEN_DAY.getMsg();
        } else if (date.equals(Holiday.WOMAN_DAY.getDayOfHoliday())) {
            names = getCustomersNamesByGender("f");
            msg   = Holiday.WOMAN_DAY.getMsg();
        } else if (date.equals(Holiday.NEW_YEAR.getDayOfHoliday())) {
            names = getCustomersNames();
            msg   = Holiday.NEW_YEAR.getMsg();
        }

        if (names.isEmpty() && !msg.isEmpty()) return msg.toUpperCase();
        if (msg.isEmpty()) return msg;
        return "Уважаемые(ая, ый) " + getCollectionToString(names, ", ") + "! Поздравляем Вас " + msg;
    }

    public String congratulation() {
        return congratulation(new SimpleDateFormat("dd.MM").format(Calendar.getInstance().getTime()));
    }
}
