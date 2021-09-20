package com.gestorfinaceiro.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "Receitas")

@Data
public class Receita {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id_Receitas")
    private Long idReceitas;

    @NotEmpty
    @Column(name = "Titulo_da_receita", length = 50)
    private String tituloReceita;

    @Column(name = "Tipo_de_receita", length = 100)
    @NotEmpty
    private String tipoReceita;

    @Column(name = "Data_de_recebimento", length = 20)
    @NotEmpty
    private String dataReceita;

    @NotEmpty 
    @Column(name = "Valor_da_receita")
    private double valorReceita;
}