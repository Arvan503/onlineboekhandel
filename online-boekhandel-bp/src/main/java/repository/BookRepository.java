package repository;

import entity.Book;
import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class BookRepository {

    private EntityManager entityManager;

    public BookRepository() {
    }

    public BookRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Book createBook(Book book) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(book);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();

        }

        return book;
    }

    public Book findBookById(Long id) {
        String sqlQuery = "SELECT b FROM Book b WHERE b.id = :id";
        TypedQuery<Book> query = entityManager.createQuery(sqlQuery, Book.class);
        query.setParameter("id", id);
        Book book = query.getSingleResult();

        return book;

    }
}
