package ru.isi.crud_sb.service;

import org.springframework.stereotype.Service;
import ru.isi.crud_sb.dao.UserDao;
import ru.isi.crud_sb.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getReferenceById(id);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public void update(Long id, User user) {
        User userForUpdate = getUser(id);
        userForUpdate.setName(user.getName());
        userForUpdate.setLastName(user.getLastName());
        userForUpdate.setAge(user.getAge());
        save(userForUpdate);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }
}