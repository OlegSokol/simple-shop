package ua.airshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartPageController {

    @RequestMapping(value = "/cartpage", method = RequestMethod.GET)
    public String getCart() {
        System.out.println("Inside getCart method");
        return "cart";
    }
}
