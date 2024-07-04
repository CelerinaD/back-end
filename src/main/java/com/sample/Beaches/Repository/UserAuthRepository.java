package com.sample.Beaches.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Beaches.Model.UserAuth;

public interface UserAuthRepository extends JpaRepository<UserAuth, Long> {
    Optional<UserAuth> findByEmail(String email);
    Optional<UserAuth> findByUsername(String username);
    Optional<UserAuth> findByUsernameOrEmail(String email, String username);

    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
