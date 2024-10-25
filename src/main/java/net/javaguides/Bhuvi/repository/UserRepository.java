package net.javaguides.Bhuvi.repository;

import net.javaguides.Bhuvi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
