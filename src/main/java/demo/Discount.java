package demo;

public class Discount {
    private int id;
    private int totalBook;
    private int discountPercentage;

    public Discount() {
    }

    public int getId() {
        return id;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
