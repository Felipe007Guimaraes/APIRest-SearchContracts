package com.felipeguimaraes.contracts.api.repositories;

import com.felipeguimaraes.contracts.api.entities.Contract;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

}
