package com.fstop.test.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstop.test.entity.User;
@Repository
public interface UserDao extends JpaRepository<User, String> {
	User findByName (String name);
}
