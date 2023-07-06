package ore.website.ore.controller;

import ore.website.ore.repository.CategoryRepository;
import ore.website.ore.repository.MenuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private CategoryRepository categoryRepsitory;
    private MenuRepository menuRepository;

    public CategoryController(CategoryRepository categoryRepsitory, MenuRepository menuRepository) {
        this.categoryRepsitory = categoryRepsitory;
        this.menuRepository = menuRepository;
    }

    @GetMapping("/menu/ctg")
    public String byMenuCtgNo(Model model, @RequestParam("no") Long ctgNo) {

        model.addAttribute("ctg_text", categoryRepsitory.getById(ctgNo));
        model.addAttribute("ctg", categoryRepsitory.findAll());


        return "menu/menu";
    }
}
