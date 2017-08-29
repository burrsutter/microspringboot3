package com.redhat.developers.osio.microspringboot3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheRESTController {
    @RequestMapping(value = "/api/orders", method = RequestMethod.POST)
    public String getOrders(String customers) {
        System.out.println("Processing Orders for customers : " + customers);
        return "O4321,O5432,O6543";
    }
}
