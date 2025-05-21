package com.speedkillsx.carrentalapiddd.domain.model;

import com.speedkillsx.carrentalapiddd.domain.enums.INSPECTION_STATUS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private INSPECTION_STATUS stateInspection;
    private LocalDate dateInspection;

    @ManyToOne
    @JoinColumn(name = "car_matricule", nullable = false)
    private Car car;
}
