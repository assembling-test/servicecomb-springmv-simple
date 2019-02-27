package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-02-27T06:56:33.244Z")

@RestSchema(schemaId = "projecto7yq")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projecto7yqImpl {

    @Autowired
    private Projecto7yqDelegate userProjecto7yqDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecto7yqDelegate.helloworld(name);
    }

}
