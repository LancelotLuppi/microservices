package com.estudos.luppi.fornecedor.controller;

import com.estudos.luppi.fornecedor.model.InfoFornecedor;
import com.estudos.luppi.fornecedor.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {
    private final InfoService infoService;

    @GetMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable("estado") String estado) {
        return infoService.getInfoPorEstado(estado);
    }
}
