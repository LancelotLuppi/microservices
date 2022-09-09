package com.estudos.luppi.loja.controller;

import com.estudos.luppi.loja.dto.CompraDTO;
import com.estudos.luppi.loja.service.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
@RequiredArgsConstructor
public class CompraController {

    private final CompraService compraService;

    @PostMapping()
    public void realizarCompra(@RequestBody CompraDTO compra) {
        compraService.realizarCompra(compra);
    }
}
