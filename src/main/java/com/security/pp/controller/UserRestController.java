package com.security.pp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    @ResponseStatus(HttpStatus.OK)
    public Principal user(Principal user) {
        return user;
    }

//    @GetMapping()
//    public ResponseEntity<User> getUser(Authentication auth) {
//        return new ResponseEntity<>((User) auth.getPrincipal(),
//                HttpStatus.OK);
//    }

}
