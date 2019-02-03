package com.project.blog.repository;

import com.project.blog.domain.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}