package com.ms.sb.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class CustomersEntity {

    @Id
    @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
    private long id;

    private String name;

    private String email;

    private Integer age;

}

