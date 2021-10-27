package com.example.productstore.domain.models;

import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "store_count")
    private Integer storeCount;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category  category;

    @ManyToMany(mappedBy = "products")
    private List<Branch> brances;
}