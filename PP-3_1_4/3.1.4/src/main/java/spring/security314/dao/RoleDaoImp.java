package spring.security314.dao;

import org.springframework.stereotype.Repository;
import spring.security314.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao {
    @PersistenceContext
    private EntityManager entityManager;

    public boolean add(Role role) {
        entityManager.persist(role);
        return true;
    }

    public Role findByName(String name) {
        return entityManager.createQuery("select xxx FROM Role xxx WHERe xxx.role = :id", Role.class)
                .setParameter("id", name)
                .getResultList().stream().findAny().orElse(null);
    }

    public List<Role> listByName(List<String> name) {
        return entityManager.createQuery("select xxx FROM Role xxx WHERe xxx.role in (:id)", Role.class)
                .setParameter("id", name)
                .getResultList();
    }
}
