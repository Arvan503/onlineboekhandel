import entity.ShoppingCart;
import service.BookService;
import service.OrderService;
import service.ShoppingCartService;
import service.UserService;

public class Main {

    public static void main(String[] args) {

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        BookService bookService = new BookService();
//        UserService userService = new UserService();
//        OrderService orderService = new OrderService();


        /*UserService userService = new UserService();
        User user = userService.findUserById(1L);

        BookService bookService = new BookService();
        Book book = bookService.findBookById(1L);


        ShoppingCart cart = new ShoppingCart();
        cart.setBooks(List.of(book));

        OrderService orderService = new OrderService();
        Order order = new Order();

        order.setOrderDate(new Timestamp(System.currentTimeMillis())); // Set the orderDate with the current timestamp
        order.setStatus("Pending");
        order.setUser(user);
        order.setCart(cart);

        orderService.createOrder(order);

         */

    }
}

//    BookService bookService = new BookService();
//
//    List<Book> booksToAdd = new ArrayList<>();
//
//        booksToAdd.add(new Book("Title 1", "Author 1", "Genre 1", "Description 1", new BigDecimal("19.99"), 100, "2022-01-01", "ISBN001"));
//        booksToAdd.add(new Book("Title 2", "Author 2", "Genre 2", "Description 2", new BigDecimal("29.99"), 150, "2022-02-01", "ISBN002"));
//        booksToAdd.add(new Book("Title 3", "Author 3", "Genre 3", "Description 3", new BigDecimal("24.99"), 120, "2022-03-01", "ISBN003"));
//
//
//    List<Book> createdBooks = bookService.createBooks(booksToAdd);
//
//
//}