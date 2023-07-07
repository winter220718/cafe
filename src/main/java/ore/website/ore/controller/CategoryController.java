package ore.website.ore.controller;

import ore.website.ore.model.Category;
import ore.website.ore.model.Menu;
import ore.website.ore.repository.CategoryRepository;
import ore.website.ore.repository.MenuRepository;
import ore.website.ore.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private CategoryRepository categoryRepsitory;
    private MenuRepository menuRepository;

    private MenuService menuService;

    public CategoryController(CategoryRepository categoryRepsitory, MenuRepository menuRepository, MenuService menuService) {
        this.categoryRepsitory = categoryRepsitory;
        this.menuRepository = menuRepository;
        this.menuService = menuService;
    }

    @GetMapping("/menu/ctg")
    public String byMenuCtgNo(Model model, @RequestParam("no") Long ctgNo) {

        model.addAttribute("ctg_text", categoryRepsitory.getById(ctgNo));
        model.addAttribute("ctg", categoryRepsitory.findAll());

        model.addAttribute("menu", menuService.getMenuByCtg(ctgNo));
        return "menu/menu";
    }
}
