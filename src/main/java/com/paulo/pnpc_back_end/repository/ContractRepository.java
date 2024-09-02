package com.paulo.pnpc_back_end.repository;

import com.paulo.pnpc_back_end.models.ContractModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//código responsável por acessar o banco de dados.
@Repository
public interface ContractRepository extends JpaRepository<ContractModel, Long> {
}
