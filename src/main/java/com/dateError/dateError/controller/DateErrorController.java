package com.dateError.dateError.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateErrorController {
    @GetMapping(value = "/dateError")
    public Date returnDate() {
        Date date = new Date(2019, 04, 29);
        return date;
    }
}
