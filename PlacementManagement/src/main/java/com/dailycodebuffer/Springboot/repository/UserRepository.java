package com.dailycodebuffer.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.Springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository< User, Long>{

}
