package com.mycomp.security.oauth2.service;

import com.mycomp.security.oauth2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired private UserService userService;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

        final Optional<User> optionalUser = this.userService.getUser(username);
        final User user = optionalUser.orElseThrow(() -> new RuntimeException("User not found with username " + username));

        return user;
    }
}
