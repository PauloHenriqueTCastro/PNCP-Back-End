package com.paulo.pnpc_back_end.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//código responsável por criar os getters, setters e construtores.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//código responsável pela criação do modelo ao qual o banco de dados vai seguir. Possui um uma criação
// automática de ID que automaticamente identifica qual id existe ou não.
@Entity
public class ContractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cnpjPublicOrganization;
    private String startDate;
    private String endDate;
    private String supplier;
    @Column(length = 51200)
    private String object;
    private Double initialValue;
}
