package com.jvsbastos.dsmeta.services;

import com.jvsbastos.dsmeta.entities.Sale;
import com.jvsbastos.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findAll(){
        return saleRepository.findAll();
    }
}
