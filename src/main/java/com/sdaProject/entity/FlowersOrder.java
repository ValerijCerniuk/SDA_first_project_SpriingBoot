package com.sdaProject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class FlowersOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flowersOrderId;

    // private boolean status;
    private String orderDate;
    private String deliveryDay;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flowersOrder")
private List<Flower> flowers;


}
