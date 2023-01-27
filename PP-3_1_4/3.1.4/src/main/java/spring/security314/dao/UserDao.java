package spring.security314.dao;

import spring.security314.model.User;

import java.util.List;

public interface UserDao {
    User getById(Integer id);

    List<User> listUsers();

    boolean add(User user);

    void removeUser(Integer id);

    void updateUser(User user);

    User findByEmail(String email);
}
