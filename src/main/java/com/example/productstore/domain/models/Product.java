package com.example.productstore.domain.models;

import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product extends  Base{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category  category;

    @ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
    private List<Branch> brances;
}