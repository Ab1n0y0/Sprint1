package com.google.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.UserService.entity.UserService;

public interface UserServiceRepository extends JpaRepository<UserService, Long>{

}
