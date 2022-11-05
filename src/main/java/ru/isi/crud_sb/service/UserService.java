package ru.isi.crud_sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.isi.crud_sb.dao.UserDao;
import ru.isi.crud_sb.model.User;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User getUser(Long id) {
        return userDao.getReferenceById(id);
    }

    public void delete(Long id) {
        userDao.deleteById(id);
    }

    public void update(Long id, User user) {
        User userForUpdate = getUser(id);
        userForUpdate.setName(user.getName());
        userForUpdate.setLastName(user.getLastName());
        userForUpdate.setAge(user.getAge());
        save(userForUpdate);
    }

    public List<User> listUsers() {
        return userDao.findAll();
    }
}
