package com.github.bzalyaliev.catsapi.controller;

import com.github.bzalyaliev.catsapi.dto.CatDto;
import com.github.bzalyaliev.catsapi.entity.Cat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
public class CatController {

    @PostMapping
    public Cat save(CatDto cat) {
        return new Cat();
    }
}
