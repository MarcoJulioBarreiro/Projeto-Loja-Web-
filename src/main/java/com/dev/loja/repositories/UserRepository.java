package com.dev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
