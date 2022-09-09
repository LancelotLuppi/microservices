package com.estudos.luppi.fornecedor.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class InfoFornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_info")
    @SequenceGenerator(name = "seq_info", sequenceName = "SEQ_ID_INFO_FORNECEDOR", allocationSize = 1)
    @Column(name = "ID_INFO_FORNECEDOR")
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ENDERECO")
    private String endereco;
}
