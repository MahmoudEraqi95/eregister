package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(path = "/")
    public String displayHome(){
        System.out.println("ts");
        return "index";
    }

}
