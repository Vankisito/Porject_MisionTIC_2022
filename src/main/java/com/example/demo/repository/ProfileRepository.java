package com.example.demo.repository;

import com.example.demo.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
