package com.security.pp.service;

import com.security.pp.model.Role;
import java.util.List;

public interface RoleService  {
    Role getRoleById(long id);

    void addRole(Role role);

    List<Role> getRoles();
}

