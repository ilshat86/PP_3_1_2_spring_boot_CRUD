package ru.isi.crud_sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isi.crud_sb.model.User;

public interface UserDao extends JpaRepository<User, Long> {

}
