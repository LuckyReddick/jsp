package com.vicitf.springboot.domain.primray;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user", schema = "dbo", catalog = "test")
//@Table(name = "t_user")
public class User {
	private Long id;
	private String username;
	private String password;
	private String realname;
	private String gender;
	private String email;
	private String avatar;
	private String loginAddress;

	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
//	@SequenceGenerator(name = "generator", sequenceName = "user_seq")
	@Column(name = "id", length = 11)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "realname", length = 50)
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "avatar", length = 50)
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "login_address", length = 20)
	public String getLoginAddress() {
		return loginAddress;
	}
	
	public void setLoginAddress(String loginAddress) {
		this.loginAddress = loginAddress;
	}
	
}
