package com.example.work;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;


@org.mapstruct.Mapper(componentModel = "spring",uses = ChildMapper.class)
public interface Mapper {




    @Mapping(source = "person.name" , target = "firstName")
    DTO modelToDto(Person person);

    @InheritInverseConfiguration
    Person dtoToModel(DTO dto);

}
