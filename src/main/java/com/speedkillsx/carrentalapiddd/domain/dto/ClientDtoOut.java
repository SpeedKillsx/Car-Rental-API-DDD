package com.speedkillsx.carrentalapiddd.domain.dto;

import com.speedkillsx.carrentalapiddd.domain.enums.CLIENT_STATUS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDtoOut {
    private String firstName;
    private String lastName;
    private String email;
    private float debts;
    private CLIENT_STATUS stateClient;
}
