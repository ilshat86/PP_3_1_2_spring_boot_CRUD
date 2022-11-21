package ru.isi.crud_sb.dao;

import ru.isi.crud_sb.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    User getReferenceById(Long id);

    void deleteById(Long id);

    List<User> findAll();
}
