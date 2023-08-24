package com.ms.sb.service;

import com.ms.sb.entity.CustomersEntity;
import com.ms.sb.model.CustomerDTO;
import com.ms.sb.repository.CustomerRepository;
import com.ms.sb.tools.CustomerModelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Slf4j
public class CustomerService {

    private final CustomerRepository repository;
    CustomerService(@Autowired CustomerRepository repository)
    {this.repository = repository;}


    public CustomersEntity getById(long id){
        CustomersEntity entity = (CustomersEntity) repository.findAllById(Collections.singleton(id));
            return entity;
    }
}
