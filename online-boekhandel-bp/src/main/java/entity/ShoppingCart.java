package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//import java.sql.Timestamp;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "cart")
    private Order order;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "cart_book",
            joinColumns = { @JoinColumn(name = "shoppingcart_id") },
            inverseJoinColumns = { @JoinColumn(name = "book_id") }
    )
    List<Book> books = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

