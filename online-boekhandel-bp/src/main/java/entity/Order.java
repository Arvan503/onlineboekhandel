package entity;

import jakarta.persistence.*;


import java.sql.Timestamp;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "cart_id", referencedColumnName = "id")
    private ShoppingCart cart;


    private Timestamp orderDate;
    private String status;


    // Getters and setters
    public Long Id() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }


    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return userId;
    }

    public void setUser(User user) {
        this.userId = userId;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }


}