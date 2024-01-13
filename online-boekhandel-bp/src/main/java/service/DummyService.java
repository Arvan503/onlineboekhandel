package service;

import entity.Book;
import entity.User;

import java.math.BigDecimal;

public class DummyService {

    private void createDummyData() {
        BookService bookService = new BookService();
        Book bookInsert = new Book();

        // Create a Book

        bookInsert.setTitle("The Great Gatsby");
        bookInsert.setAuthor("F. Scott Fitzgerald");
        bookInsert.setGenre("Fiction");
        bookInsert.setDescription("A classic novel set in the roaring twenties.");
        bookInsert.setPrice(new BigDecimal("19.99"));
        bookInsert.setStockQuantity(100);
        bookInsert.setPublicationDate("1925-04-10");  // Replace with the actual publication date format
        bookInsert.setIsbnNumber("9781234567890");// Replace with the actual ISBN format
        bookInsert.setCopy(5);

        bookService.createBook(bookInsert);

        UserService userService = new UserService();
        User insertUser = new User();

        insertUser.setUsername("john_doe");
        insertUser.setPassword("securePassword");
        insertUser.setEmail("john.doe@example.com");
        insertUser.setAddress("123 Main Street");
        insertUser.setPhoneNumber("123-456-7890");

        userService.createUser(insertUser);
    }
}
