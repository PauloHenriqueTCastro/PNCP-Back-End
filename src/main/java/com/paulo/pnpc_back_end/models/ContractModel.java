package com.paulo.pnpc_back_end.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

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
