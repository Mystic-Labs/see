package com.sistema.see.controller;

import com.sistema.see.model.User;
import com.sistema.see.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository usuario;
    @RequestMapping(value = "/api/usuario", method = RequestMethod.GET)
    public List<User> Get() {
        return usuario.findAll();
    }

}
