package com.mycomp.security.oauth2.service;

import com.mycomp.security.oauth2.model.Role;
import com.mycomp.security.oauth2.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    private static Role adminRole;
    private static Role userRole;

    private static List<User> users;


    public void runSetup(final PasswordEncoder passwordEncoder) {
        users = new ArrayList<>();
        adminRole = new Role(1L, "ADMIN");
        userRole = new Role(2L, "USER");

        users.add(new User(101L, "FirstUser", passwordEncoder.encode("FirstUser"), adminRole));
        users.add(new User(102L, "SecondUser", passwordEncoder.encode("SecondUser"), adminRole));
        users.add(new User(103L, "ThirdUser", passwordEncoder.encode("ThirdUser"), userRole));
        users.add(new User(104L, "FourthUser", passwordEncoder.encode("FourthUser"), userRole));
    }

    public Role getAdminRole() {
        return adminRole;
    }

    public Role getUserRole() {
        return userRole;
    }

    public List<User> getUsers() {
        return users;
    }
    public Optional<User> getUser(final String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

}
