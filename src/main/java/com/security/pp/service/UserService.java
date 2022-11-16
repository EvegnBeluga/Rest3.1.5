package com.security.pp.service;

import com.security.pp.model.User;
import java.util.List;

public interface UserService {
    User findUserById(long id);

    User findUserByEmail(String email);

    List<User> getUsers();

    void saveUser(User user);

    void editUser(User user);

    void deleteById(long id);

}
