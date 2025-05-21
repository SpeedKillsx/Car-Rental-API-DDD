package com.speedkillsx.carrentalapiddd.domain.model;

import com.speedkillsx.carrentalapiddd.domain.enums.LOCATION_STATE;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private LOCATION_STATE locationState;


    @ManyToOne
    @JoinColumn(name = "car_matricule", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
