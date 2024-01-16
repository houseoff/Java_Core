package ru.gb.hw4.model;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Customer extends ShopElement {
    enum Gender {
        m, f
    }

    public static int MIN_AGE = 18;
    public static int MAX_AGE = 120;

    private String name;
    private Gender gender;
    private int age;
    private String phone;

    public Customer(int id, String name, String gender, int age, String phone) {
        this.id = id;
        setGender(Gender.valueOf(gender));
        setName(name);
        setAge(age);
        setPhone(phone);
    }

    public Customer(int id, String name, String phone) {
        this(id, name, "m", 0, phone);
    }

    public void setName(String name) {
        this.name = name.trim().toLowerCase();
    }

    public void setAge(int age) {
        this.age = Math.max(Math.min(age, Customer.MAX_AGE), Customer.MIN_AGE);
    }

    @Override
    public String toString() {
        return "Customer(" +
                "ID=" + getId() +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ')';
    }
}
