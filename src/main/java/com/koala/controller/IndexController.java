package com.koala.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.koala.controller.domain.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2022/5/18 0:05
 * @Created by koala
 */

@RestController
public class IndexController {

    private Map<Long,Person> persons;

    @PostConstruct
    public void init(){
        persons = new HashMap<Long,Person>();
    }


    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }

    @PostMapping("/add/person")
    public Collection<Person> addPerson(@Validated @RequestBody Person person){
        persons.put(person.getId(),person);
        return persons.values();
//        return JSON.toJSONString(persons.values());
//        final ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(persons.values());
    }

    @GetMapping("/del/person")
    public Collection<Person> delPerson(Long id){
        persons.remove(id);
        return persons.values();
//        return JSON.toJSONString(persons.values());
//        final ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(persons.values());
    }



}
