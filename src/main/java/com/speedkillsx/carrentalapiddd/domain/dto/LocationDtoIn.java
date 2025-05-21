package com.speedkillsx.carrentalapiddd.domain.dto;

import com.speedkillsx.carrentalapiddd.domain.enums.LOCATION_STATE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocationDtoIn {
    private int id;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private BigDecimal amount;
    private LOCATION_STATE locationState;
    private String carMatricule;
    private int clientId;
}
