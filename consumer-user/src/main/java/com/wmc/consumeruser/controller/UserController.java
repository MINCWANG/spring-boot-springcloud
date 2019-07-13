package com.wmc.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: WangMC
 * @date: 2019/7/13 21:33
 * @description:
 */
@RestController
public class UserController {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        String template = restTemplate.getForObject("http://provider-ticket/ticket", String.class);
        return name + "购买了"+template;
    }
}
