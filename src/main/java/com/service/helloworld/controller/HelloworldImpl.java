package com.service.helloworld.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-23T06:52:52.241Z")

@RestSchema(schemaId = "helloworld")
@RequestMapping(path = "/helloworld", produces = MediaType.APPLICATION_JSON)
public class HelloworldImpl {

    @Autowired
    private HelloworldDelegate userHelloworldDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHelloworldDelegate.helloworld(name);
    }

}
