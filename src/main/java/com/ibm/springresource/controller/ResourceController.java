package com.ibm.springresource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by THLiu on 5/21/2018.
 *
 */
@RestController
@PreAuthorize("isAuthenticated()")
public class ResourceController {

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping(value = "/api/info", method = RequestMethod.GET)
    public String getInfo(){
        return "info";
    }
}
