package com.ag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ag.entity.PhoneEntity;

@Repository
public interface PhoneRepo extends JpaRepository<PhoneEntity, Integer> {

	
}
