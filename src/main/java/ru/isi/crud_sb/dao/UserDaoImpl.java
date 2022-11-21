package ru.isi.crud_sb.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.isi.crud_sb.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImpl() {
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getReferenceById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteById(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("SELECT user from User user").getResultList();
    }
}
