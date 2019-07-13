package com.wmc.providerticket.controller;

import com.wmc.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: WangMC
 * @date: 2019/7/13 21:02
 * @description:
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        String ticket = ticketService.getTicket();
        return ticket;
    }
}
