package edu.xcdq.beans;

public class Customer  extends  Person{
    //顾客独有的属性
    private  String  customerId;
    private  String   phone;

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer(String name, String sex, int age, String pwd, String phone, String customerId, String phone1) {
        super(name, sex, age, pwd, phone);
        this.customerId = customerId;
        this.phone = phone1;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
