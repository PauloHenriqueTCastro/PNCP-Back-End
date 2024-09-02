package com.paulo.pnpc_back_end.controller;

import com.paulo.pnpc_back_end.models.ContractModel;
import com.paulo.pnpc_back_end.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping
    public List<ContractModel> getContracts() {
        return apiService.getAllContracts();
    }

    @PostMapping
    public void saveContracts(@RequestBody List<ContractModel> contracts) {
        apiService.saveContracts(contracts);
    }

}
