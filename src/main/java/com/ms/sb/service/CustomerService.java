package com.ms.sb.service;

import com.ms.sb.entity.CustomersEntity;
import com.ms.sb.model.CustomerDTO;
import com.ms.sb.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerService {

    private final CustomerRepository repository;
    CustomerService(@Autowired CustomerRepository repository) {this.repository = repository;}


    public List<CustomersEntity> getAll(){
        List<CustomersEntity> entity = repository.findAll();
            return entity;
    }

    public void addCustomers(CustomerDTO customer) {
        CustomersEntity entity = new CustomersEntity();
        entity.setName(customer.getName());
        entity.setEmail(customer.getEmail());
        entity.setAge(customer.getAge());

         repository.save(entity);
    }

    public void deleteCustomerById(long id){
        repository.deleteById(id);
    }
}
