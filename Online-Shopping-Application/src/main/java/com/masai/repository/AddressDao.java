package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.exception.AddressException;
import com.masai.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer>{
	@Query("select a from Address a where a.state = ?1")
	public Address viewAddressByState(String state) throws AddressException;
}
