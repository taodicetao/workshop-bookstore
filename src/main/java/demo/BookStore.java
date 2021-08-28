package demo;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        Customer customer = new Customer();
        BookStore bookStore = new BookStore();
        bookStore.buy(customer);
    }

    private void buy(Customer customer) {
        Book book1 = new Book();
        Book book2 = new Book();

        // Add book to basket
        Basket basket = new Basket(customer);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        // cal max discount
        Discount discount = new Discount();
        discount.calculate(basket);

        // checkout
        Checkout checkout = new Checkout();
        checkout.process(new Payment(), new Shipping());
    }

    private void addToBasket() {
    }

    private List<Book> listOfBooks() {
        return null;
    }
}
