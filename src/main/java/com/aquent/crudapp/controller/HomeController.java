package com.aquent.crudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Simple controller to redirect to the person listing.  In the future, we could
 * add other landing page behavior here if we were writing a real application.
 */
@Controller
public class HomeController {
    /**
     * Redirect to the person list.
     * In a real application this could be our landing or login page.
     *
     * @return redirect to the person list
     */
    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView response = new ModelAndView();
        response.setViewName("home.html");
        return response;
    }
}
