package com.speedkillsx.carrentalapiddd.domain.dto;


import com.speedkillsx.carrentalapiddd.domain.enums.CLIENT_STATUS;
import com.speedkillsx.carrentalapiddd.domain.enums.LOCATION_STATE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestitutionDtoOut {
    private int id;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private LocalDate dateRestitution;
    private int clientId;
    private String carMatricule;
    private LOCATION_STATE locationState;
    private CLIENT_STATUS clientStatus;

}
