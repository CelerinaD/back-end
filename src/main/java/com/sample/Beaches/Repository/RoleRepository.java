package com.sample.Beaches.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Beaches.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);

}
