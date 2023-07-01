package ore.website.ore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {

        return "home";
    }

    @GetMapping("/menu")
    public String menu(Model model) {

        return "menu";
    }

}
