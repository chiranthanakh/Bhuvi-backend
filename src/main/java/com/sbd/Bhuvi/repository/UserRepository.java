package com.sbd.Bhuvi.repository;

import com.sbd.Bhuvi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
