package ore.website.ore.service;

import ore.website.ore.model.Category;
import ore.website.ore.model.Menu;
import ore.website.ore.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getMenuByCtg(Long ctgNo) {
        return menuRepository.findByCtgNo(ctgNo);
    }
}
