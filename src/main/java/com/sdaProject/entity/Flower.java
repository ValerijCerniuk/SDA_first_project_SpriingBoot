package com.sdaProject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flowerId")
    private Integer flowerId;
    private String name;
    private Integer flowerPrice;
    private String color;
    // private Integer suppler_id;

    @ManyToOne
    @JoinColumn(name = "flowersOrderId")
    FlowersOrder flowersOrder;

}
