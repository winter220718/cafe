package ore.website.ore.controller;

import ore.website.ore.model.Menu;
import ore.website.ore.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MenuController {

    private MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/test")
    public String byCtg(Model model, Long ctgNo) {

        model.addAttribute("menu", menuRepository.findAll());

        return "menu-list";
    }

}
