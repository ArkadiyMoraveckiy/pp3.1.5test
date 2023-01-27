package spring.security314.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import spring.security314.model.Role;
import spring.security314.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User getById(Integer id);

    List<User> listUsers();

    void removeUser(Integer id);

    void updateUser(User user);

    boolean add(User user);

    List<Role> listByRole(List<String> lsr);

    User findByEmail(String email);
}
