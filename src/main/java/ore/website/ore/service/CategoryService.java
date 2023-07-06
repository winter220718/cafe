package ore.website.ore.service;

import ore.website.ore.model.Category;
import ore.website.ore.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Iterable<Category> getEntitiesByCtgNo(Long ctgNo) {
        return categoryRepository.findAllById(Collections.singletonList(ctgNo));
    }


}
