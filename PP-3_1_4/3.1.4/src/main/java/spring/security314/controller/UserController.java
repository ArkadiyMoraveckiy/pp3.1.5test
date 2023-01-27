package spring.security314.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.security314.dao.UserDao;
import spring.security314.model.User;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "")
    public String printWelcome(ModelMap model, Principal principal) {
        User user = userDao.findByEmail(principal.getName());
        model.addAttribute("roles", user.getRoles());
        model.addAttribute("user", user);
        return "user/user";
    }



}


