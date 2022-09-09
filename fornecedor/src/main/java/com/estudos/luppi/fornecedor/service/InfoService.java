package com.estudos.luppi.fornecedor.service;

import com.estudos.luppi.fornecedor.model.InfoFornecedor;
import com.estudos.luppi.fornecedor.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}
