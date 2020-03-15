package com.anmbhy.springflyway.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> all () {
        return ResponseEntity.ok("Hello from user controller!");
    }

}
