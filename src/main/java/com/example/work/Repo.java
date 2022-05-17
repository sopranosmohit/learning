package com.example.work;


import com.example.work.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Person, Long> {


    Person findByHeight(String height);


    @Query("select count(*) from Person")
    int getCount();


}
