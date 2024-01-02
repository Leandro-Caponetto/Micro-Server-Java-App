
package com.srpingboot.micro.repository;

import com.srpingboot.micro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    
}
