package com.market.app.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "clients")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "id_client")
    private UUID idClient;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_last_name")
    private String clientLastName;

    @Column(name = "client_cellphone")
    private Long clientCellphone;

    @Column(name = "client_email")
    private String clientEmail;

    @OneToMany(mappedBy = "client")
    private List<Pucharse> pucharses;
}
