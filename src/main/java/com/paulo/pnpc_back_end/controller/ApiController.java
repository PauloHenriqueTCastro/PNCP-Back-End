package com.paulo.pnpc_back_end.controller;

import com.paulo.pnpc_back_end.models.ContractModel;
import com.paulo.pnpc_back_end.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//código responsável por permitir a requisição pelo endereço direcionado. Evita o erro de CORS.
@CrossOrigin(origins = "http://localhost:5173")

//código responsável pela criação do controlador. Ele gera a rota "/api" no endereço local e
// gerencia as rotas de GET e POST e seus métodos de que são criados dentro da pastar "service".
@RestController
@RequestMapping("/api")
public class ApiController {
    //código chamar a classe de services.
    @Autowired
    private ApiService apiService;

    //código responsável por gerar a rota de GET.
    @GetMapping
    public List<ContractModel> getContracts() {
        return apiService.getAllContracts();
    }

    //código responsável por gera a rota de POST.
    @PostMapping
    public void saveContracts(@RequestBody List<ContractModel> contracts) {
        apiService.saveContracts(contracts);
    }

}
