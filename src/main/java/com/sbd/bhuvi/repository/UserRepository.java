package com.sbd.bhuvi.repository;

import com.sbd.bhuvi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
