package com.market.app.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "products")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id_product")
    private UUID idProduct;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "id_category", insertable = false, updatable = false)
    private Category category;

    @Column(name = "bar_code")
    private String barCode;

    @Column(name = "product_price")
    private BigDecimal productPrice;

    @Column(name = "product_stock")
    private Integer productStock;

    @Column(name = "product_status")
    private Boolean productStatus;

}
