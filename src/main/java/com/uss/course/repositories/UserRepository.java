package com.uss.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uss.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
