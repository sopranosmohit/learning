package com.example.work;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WorkApplicationTests {

    @Autowired
    Mapper mapper ;

    @Test
    void contextLoads() {
    }




    @Test
    void checkMapper()
    {
       /* Person p = new Person(1L,"rohit","1");
        DTO dto = new DTO(1);

        dto = mapper.modelToDto(p)   ;
        String s = "1";
        assertEquals(dto.getHeight(),1);
*/
    }
}
