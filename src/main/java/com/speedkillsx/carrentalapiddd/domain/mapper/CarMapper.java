package com.speedkillsx.carrentalapiddd.domain.mapper;

import com.speedkillsx.carrentalapiddd.domain.dto.CarDtoIn;
import com.speedkillsx.carrentalapiddd.domain.dto.CarDtoOut;
import com.speedkillsx.carrentalapiddd.domain.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDtoOut toCarDtoOut(Car car);

    Car toCar(CarDtoOut carDtoOut);

    CarDtoIn toCarDtoIn(Car car);
    Car toCar(CarDtoIn carDtoIn);

    List<CarDtoOut> toCarDtoOutList(List<Car> cars);
    List<Car> toCarList(List<CarDtoOut> carsDtoOut);
}
