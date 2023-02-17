package com.example.SpringBoot312.repository;

import com.example.SpringBoot312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
