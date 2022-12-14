package com.security.pp.repository;

import com.security.pp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select p from User p join fetch p.roles where p.email = :email")
    User findByEmail(String email);
}
