package com.github.bzalyaliev.catsapi.repository;

import com.github.bzalyaliev.catsapi.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

interface CatRepository extends JpaRepository<Cat, String> {
}

