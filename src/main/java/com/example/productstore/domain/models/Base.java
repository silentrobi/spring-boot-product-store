package com.example.productstore.domain.models;

import lombok.Data;
import javax.persistence.Column;
import java.util.Date;

@Data
public class Base {

    @Column(name="created_at")
    private Date createdAt;

    @Column(name="updated_at")
    private Date updatedAt;

    @Column(name="deleted_at")
    private Date deletedAt;
}
