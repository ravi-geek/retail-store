package com.example.retailstore.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    protected BaseEntity(Long id) {
        this.id = id;
    }
}
