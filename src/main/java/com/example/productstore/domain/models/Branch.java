package com.example.productstore.domain.models;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "branch")
@Data
public class Branch {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @ManyToMany
    @JoinTable(name = "branch_product", joinColumns = @JoinColumn(name = "branch_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;
}