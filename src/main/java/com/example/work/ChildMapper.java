package com.example.work;

import org.mapstruct.Mapper;

@Mapper
public interface ChildMapper {

    ChildDto modelToDto(Child child);


}
