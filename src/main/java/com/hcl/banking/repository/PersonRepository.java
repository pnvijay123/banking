package com.hcl.banking.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hcl.banking.entity.Account;

@RepositoryRestResource(collectionResourceRel = "banking", path = "banking")
public interface PersonRepository extends PagingAndSortingRepository<Account, Long> {

	

}
