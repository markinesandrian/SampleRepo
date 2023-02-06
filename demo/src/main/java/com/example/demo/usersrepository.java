package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usersrepository extends JpaRepository<users,Long> {
	public List<users> findByname(String name);
	public List<users> findByPassword(String password);
}
