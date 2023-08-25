package com.app.entities;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="security_role")
public class SecurityRole implements GrantedAuthority {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private Long roleId;
	
	@Column(name = "role_name")
	private String authority;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}

	public SecurityRole(Long roleId, String authority) {
		super();
		this.roleId = roleId;
		this.authority = authority;
	}

	public SecurityRole(String authority) {
		super();
		this.authority = authority;
	}

	public SecurityRole() {
		super();
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
	

}
