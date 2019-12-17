package model;

public class CustomerModel {
    public int id;
    public String customerName;
    public String contactLastName;
    public int phone;
    public String city;

    public CustomerModel(String customerName, String contactLastName, int phone, String city) {
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.phone = phone;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public int getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                '}';
    }
}
