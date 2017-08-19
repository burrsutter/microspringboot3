package com.redhat.developers.osio.microspringboot3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheRESTController {
    @RequestMapping("/api/orders") 
    public String getOrders(String customers) {
        return "O4321,O5432,O6543";
    }
}