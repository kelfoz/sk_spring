package org.example.web.controllers;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Log4j
@Controller
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        log.info("GET/ HomePage returns index.html");
        return new ModelAndView("index");
    }
}
