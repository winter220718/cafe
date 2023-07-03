package ore.website.ore.controller;

import ore.website.ore.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private CategoryRepository categoryRepsitory;

    public CategoryController(CategoryRepository categoryRepsitory) {
        this.categoryRepsitory = categoryRepsitory;
    }

    @GetMapping("/menu/ctg")
    public String byMenuCtgNo(Model model, @RequestParam("ctgNo") Long ctgNo) {
        model.addAttribute("ctg", categoryRepsitory.findAll());

        return "menu/menu-aside";
    }
    @GetMapping("/menu/test")
    public String byMenu(Model model) {
        model.addAttribute("ctg", categoryRepsitory.findAll());

        return "menu/menu-aside";
    }

}
