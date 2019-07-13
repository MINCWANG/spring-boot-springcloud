package com.wmc.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author: WangMC
 * @date: 2019/7/13 21:01
 * @description:
 */
@Service
public class TicketService {
    public String getTicket(){
        System.out.println("8082");
        return "<秦时明月之沧海横流>";
    }
}
