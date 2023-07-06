package ore.website.ore.controller;

import ore.website.ore.model.Category;
import ore.website.ore.repository.CategoryRepository;
import ore.website.ore.repository.MenuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class MenuController {

    private MenuRepository menuRepository;

    private CategoryRepository categoryRepsitory;

    public MenuController(MenuRepository menuRepository, CategoryRepository categoryRepsitory) {
        this.menuRepository = menuRepository;
        this.categoryRepsitory = categoryRepsitory;
    }

    @GetMapping("/menu")
    public String byCtg(Model model) {

        //첫화면 커피
        model.addAttribute("ctg_text", categoryRepsitory.getById(1l));
        model.addAttribute("ctg", categoryRepsitory.findAll());


        return "/menu/menu";
    }



}
