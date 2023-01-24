package com.flm.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.rest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
