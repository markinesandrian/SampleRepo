package com.example.MsSqlSample;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
	private Long id;
    @Column(name = "name")
	private String name;
    @Column(name = "password")
	private String password;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
