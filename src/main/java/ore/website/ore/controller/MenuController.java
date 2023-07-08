package ore.website.ore.controller;

import ore.website.ore.model.Category;
import ore.website.ore.repository.CategoryRepository;
import ore.website.ore.repository.MenuRepository;
import ore.website.ore.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class MenuController {

    private MenuRepository menuRepository;

    private CategoryRepository categoryRepsitory;

    private MenuService menuService;

    public MenuController(MenuRepository menuRepository, CategoryRepository categoryRepsitory, MenuService menuService) {
        this.menuRepository = menuRepository;
        this.categoryRepsitory = categoryRepsitory;
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    public String byCtg(Model model) {

        //첫화면 커피
        model.addAttribute("ctg_text", categoryRepsitory.getById(1l));
        model.addAttribute("ctg", categoryRepsitory.findAll());
        model.addAttribute("menu", menuService.getMenuByCtg(1l));


        return "/menu/menu";
    }



}
