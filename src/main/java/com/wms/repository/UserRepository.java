package com.wms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wms.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);
}