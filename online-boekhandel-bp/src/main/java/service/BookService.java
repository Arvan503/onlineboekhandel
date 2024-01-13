package service;

import configuration.JPAConfiguration;
import entity.Book;
import repository.BookRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private final BookRepository repository;

    public BookService() {
        this.repository = new BookRepository(JPAConfiguration.getEntityManager());
        //this.bookFactory = new ConcreteBookFactory();
    }


    public Book createBook(Book book) {
        return repository.createBook(book);
    }

    public Book findBookById(Long id) {
        return repository.findBookById(id);
    }



    /*public List<Book> createBooks(List<Book> books) {
        List<Book> createdBooks = new ArrayList<>();
        for (Book book : books) {
            Book createdBook = bookFactory.createBook(
                    book.getTitle(),
                    book.getAuthor(),
                    book.getGenre(),
                    book.getDescription(),
                    book.getPrice(),
                    book.getStockQuantity(),
                    book.getPublicationDate(),
                    book.getIsbnNumber(),
                    book.getCopy()
            );
            repository.createBook(createdBook);
            createdBooks.add(createdBook);
        }
        return createdBooks;
    }*/
}





