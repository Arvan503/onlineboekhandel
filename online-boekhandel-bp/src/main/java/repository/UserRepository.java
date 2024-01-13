package repository;

import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UserRepository {

    private EntityManager entityManager;

    public UserRepository() {
    }

    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public User createUser(User user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }

        return user;
    }

    public User findUserById(Long id) {
        String sqlQuery = "SELECT u FROM User u WHERE u.id = :id";
        TypedQuery<User> query = entityManager.createQuery(sqlQuery, User.class);
        query.setParameter("id", id);
        User user = query.getSingleResult();

        return user;

    }
}

