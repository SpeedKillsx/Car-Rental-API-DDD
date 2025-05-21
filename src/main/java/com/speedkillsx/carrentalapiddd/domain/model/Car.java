package com.speedkillsx.carrentalapiddd.domain.model;

import com.speedkillsx.carrentalapiddd.domain.enums.CAR_STATUS;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
    @Id
    private String matricule;

    private String model;
    @Enumerated(EnumType.STRING)
    private CAR_STATUS state;
    private long distanceTraveled;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Location> location;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Inspection> inspections;
}
