package com.paulo.pnpc_back_end.repository;

import com.paulo.pnpc_back_end.models.ContractModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<ContractModel, Long> {

}
