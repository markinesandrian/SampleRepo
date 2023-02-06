package com.example.MsSqlSample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository  extends JpaRepository<Users,Long> {
	public List<Users> findByname(String name);
	public List<Users> findByPassword(String password);
}

