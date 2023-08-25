package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.SecurityRole;

@Repository
public interface SecurityRoleRepository extends JpaRepository<SecurityRole,Long>{

	Optional<SecurityRole> findByAuthority(String authority);
}
