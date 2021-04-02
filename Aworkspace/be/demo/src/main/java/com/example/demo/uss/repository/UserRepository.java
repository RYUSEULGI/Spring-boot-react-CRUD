package com.example.demo.uss.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.uss.domain.User;

interface UserCustomRepository{
}

public interface UserRepository extends JpaRepository<User, Long>, 
										UserCustomRepository{
	@Transactional
	@Query(value="select * from users where users.username=:username and users.password=:password", nativeQuery = true)
	public User login(@Param("username") String username, @Param("password") String password);
}