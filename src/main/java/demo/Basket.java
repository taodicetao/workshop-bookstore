package demo;

import java.util.List;

public class Basket {
    private int id;
    private String detail;
    private int quantity;
    private int discount;
    private int total;
    private List<Book> books;
    private Customer customer;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public void addBook() {

    }

    public int getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public int getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
