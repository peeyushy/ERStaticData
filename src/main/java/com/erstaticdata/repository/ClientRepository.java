package com.erstaticdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erstaticdata.model.Client;

import constants.AppConstants.ClientType;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findByclienttype(ClientType clientType);
}
