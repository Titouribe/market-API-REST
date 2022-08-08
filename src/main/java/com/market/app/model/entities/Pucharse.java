package com.market.app.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pucharses")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pucharse {

    @Id
    @GeneratedValue
    @Column(name = "id_pucharse")
    private UUID idPucharse;

    @ManyToOne
    @JoinColumn(name = "id_client",insertable = false, updatable = false)
    private Client client;

    @Column(name = "pucharse_date")
    private LocalDateTime pucharseDate;

    @Column(name = "paymen_method")
    private String paymentMethod;

    @Column(name = "paymen_comment")
    private String paymentComment;

    @Column(name = "pucharse_status")
    private Boolean pucharseStatus;

    @OneToMany(mappedBy = "product")
    private List<PucharsesProduct> products;
}
