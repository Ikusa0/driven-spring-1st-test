package com.test.holidayzer.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.test.holidayzer.system.Holidayzer;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/holidays")
public class AllHolidays {

  @GetMapping
  public List getHolidays() {
    return new Holidayzer().getAll();
  }

  @GetMapping("/{date}")
  public String findHoliday(@PathVariable("date") String date) {
    return new Holidayzer().findHoliday(date);
  }
}
