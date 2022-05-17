package com.example.work.restControllers;


import com.example.work.Person;
import com.example.work.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerRest {


    @Autowired private Repo repo;


    @RequestMapping("/getMeEverything")
    public Person getEverything ()
    {
        List<Person> students = new ArrayList<>();
         Person p = repo.findByHeight("9");
        System.out.println(p.getHeight());
        return  p;

    }


    @RequestMapping("/get")
    public String getEverything1 ()
    {
            repo.save(new Person(3L,"sds","asda"));

        return  repo.getCount() + "";

    }
}
