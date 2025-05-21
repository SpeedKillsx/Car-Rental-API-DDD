package com.speedkillsx.carrentalapiddd.domain.dto;

import com.speedkillsx.carrentalapiddd.domain.enums.INSPECTION_STATUS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InspectionDtoIn {
    private int id;
    private INSPECTION_STATUS stateInspection;
    private LocalDate dateInspection;
    private String carMatricule;
}
