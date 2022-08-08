package com.market.app.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "categories")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "id_category")
    private UUID idCategory;

    private String description;

    @Column(name = "category_status")
    private Boolean categoryStatus;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
