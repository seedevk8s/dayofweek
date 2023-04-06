package com.earth.dayofweek;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DayOfTheWeek {

    @RequestMapping("/dayofweek")
    public String dayweek(HttpServletRequest request) {
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

        return "Friday";
    }
}
