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

    @GetMapping("/ore-place")
    public String orePlace() {
        return "/place/ore-place";
    }
}
