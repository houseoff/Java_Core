package ru.gb.hw4.presenter;

import ru.gb.hw4.model.service.ShopService;
import ru.gb.hw4.view.View;

public class MainPresenter extends Presenter {
    private final ShopService svc;

    public MainPresenter(View view) {
        super(view);
        this.svc = new ShopService();
    }

    public void setShop() {
        svc.setShop();
    }

    public void makePurchase(String customerName, String productName, int quantity) {
        view().print(svc.makePurchase(customerName, productName, quantity));
    }

    public boolean isEmptyShop() {
        return svc.isEmptyShop();
    }

    public void getCustomersToString() {
        view().print(svc.getCustomersToString());
    }

    public void getProductsToString() {
        view().print(svc.getProductsToString());
    }

    public void getOrdersToString() {
        view().print(svc.getOrdersToString());
    }

    public String getSalesCount() {
        return svc.getSalesCount();
    }

    public void congratulation() {
        view().print(svc.congratulation("06.03"));
    }
}
