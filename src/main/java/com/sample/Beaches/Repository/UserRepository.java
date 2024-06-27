package com.sample.Beaches.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.Beaches.Model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
