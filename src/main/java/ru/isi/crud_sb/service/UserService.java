package ru.isi.crud_sb.service;

import ru.isi.crud_sb.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User getUser(Long id);

    void delete(Long id);

    void update(Long id, User user);

    List<User> listUsers();
}
