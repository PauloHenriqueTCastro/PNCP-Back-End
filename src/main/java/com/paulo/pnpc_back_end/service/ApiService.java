package com.paulo.pnpc_back_end.service;

import com.paulo.pnpc_back_end.models.ContractModel;
import com.paulo.pnpc_back_end.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//Código responsável pela criação da service que gerencia as ações do banco de dados.
@Service
public class ApiService {

    //código responsável por chamar o código responsável pelo acesso do ao banco de dados.
    @Autowired
    private ContractRepository contractRepository;

    //código responsável por pegar todos os contratos salvos na API.
    public List<ContractModel> getAllContracts() {
        return contractRepository.findAll();
    }

    //código responsável por salvar todos os contratos passados por parâmetros na API.
    public void saveContracts( List<ContractModel> contracts) {
        contractRepository.saveAll(contracts);
    }
}
