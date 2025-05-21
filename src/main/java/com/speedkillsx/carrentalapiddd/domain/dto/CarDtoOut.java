package com.speedkillsx.carrentalapiddd.domain.dto;

import com.speedkillsx.carrentalapiddd.domain.enums.CAR_STATUS;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoOut {
    private String matricule;
    private String model;
    private CAR_STATUS state;
    private Long distanceTraveled;
}
