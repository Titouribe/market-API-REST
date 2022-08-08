package com.market.app.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "pucharses_products")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PucharsesProduct {

    @Id
    @GeneratedValue
    @Column(name = "id_pucharses_product")
    private UUID idPucharsesproduct;

    @ManyToOne
    @JoinColumn(name = "id_pucharse", insertable = false, updatable = false)
    private Pucharse pucharse;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    private Integer amount;

    private BigDecimal total;

    private Boolean status;
}
