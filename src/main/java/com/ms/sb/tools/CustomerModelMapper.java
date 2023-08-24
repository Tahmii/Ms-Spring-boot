package com.ms.sb.tools;

import com.ms.sb.entity.CustomersEntity;
import com.ms.sb.model.CustomerDTO;

public class CustomerModelMapper {

    public CustomerDTO convertToDto(CustomersEntity entity){
        CustomerDTO dto = new CustomerDTO();
        dto.setAge(entity.getAge());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        return dto;
    }

}
