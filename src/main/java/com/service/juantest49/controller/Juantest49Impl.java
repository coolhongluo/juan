package com.service.juantest49.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-09T02:05:01.605Z")

@RestSchema(schemaId = "juantest49")
@RequestMapping(path = "/juantest49", produces = MediaType.APPLICATION_JSON)
public class Juantest49Impl {

    @Autowired
    private Juantest49Delegate userJuantest49Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userJuantest49Delegate.helloworld(name);
    }

}
