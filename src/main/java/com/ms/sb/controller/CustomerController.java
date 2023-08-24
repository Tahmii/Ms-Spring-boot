package com.ms.sb.controller;

import com.ms.sb.entity.CustomersEntity;
import com.ms.sb.model.CustomerDTO;
import com.ms.sb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService cs;
    CustomerController(@Autowired CustomerService cs){this.cs = cs;}
    @GetMapping()
    public List<CustomersEntity> getAll(){
        List<CustomersEntity> response =  cs.getAll();
        return response;
    }

    @PostMapping()
    public void createCustomer(@RequestBody CustomerDTO dto) {
             cs.addCustomers(dto);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") long id){
        cs.deleteCustomerById(id);
    }

}
