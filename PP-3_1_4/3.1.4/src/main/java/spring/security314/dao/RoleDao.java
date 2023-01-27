package spring.security314.dao;

import spring.security314.model.Role;

import java.util.List;

public interface RoleDao {
    boolean add(Role role);

    Role findByName(String name);

    List<Role> listByName(List<String> name);
}
