package com.jvsbastos.dsmeta.controllers;

import com.jvsbastos.dsmeta.entities.Sale;
import com.jvsbastos.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Sale>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(saleService.findAll());
    }
}
