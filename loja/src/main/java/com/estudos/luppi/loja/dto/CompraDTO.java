package com.estudos.luppi.loja.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompraDTO {
    private List<ItemDaCompraDTO> itens;
    private EnderecoDaCompraDTO endereco;
}
