package com.lucas.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
