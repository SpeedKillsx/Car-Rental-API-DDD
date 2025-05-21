package com.speedkillsx.carrentalapiddd.domain.mapper;


import com.speedkillsx.carrentalapiddd.domain.dto.LocationDtoIn;
import com.speedkillsx.carrentalapiddd.domain.dto.LocationDtoOut;
import com.speedkillsx.carrentalapiddd.domain.model.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    @Mapping(target = "id", ignore = true)
    LocationDtoIn toLocationDtoIn(Location location);
    Location toLocation(LocationDtoIn locationDtoIn);

    LocationDtoOut toLocationDtoOut(Location location);

    List<LocationDtoOut> toLocationDtoOutList(List<Location> locations);

}
