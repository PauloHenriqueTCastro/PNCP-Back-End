package com.paulo.pnpc_back_end.service;

import com.paulo.pnpc_back_end.models.ContractModel;
import com.paulo.pnpc_back_end.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
    @Autowired
    private ContractRepository contractRepository;

    public List<ContractModel> getAllContracts() {
        return contractRepository.findAll();
    }

    public void saveContracts( List<ContractModel> contracts) {
        contractRepository.saveAll(contracts);
    }
}
