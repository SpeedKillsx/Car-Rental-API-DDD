package com.speedkillsx.carrentalapiddd.domain.mapper;


import com.speedkillsx.carrentalapiddd.domain.dto.ClientDtoIn;
import com.speedkillsx.carrentalapiddd.domain.dto.ClientDtoOut;
import com.speedkillsx.carrentalapiddd.domain.model.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientDtoIn toClientDtoIn(Client client);

    Client toClient(ClientDtoIn clientDtoIn);

    ClientDtoOut toClientDtoOut(Client client);
    Client toClient(ClientDtoOut clientDtoOut);

    List<ClientDtoOut> toClientDtoOutList(List<Client> clients);
    List<Client> toClientList(List<ClientDtoOut> clientsDtoOut);
}
