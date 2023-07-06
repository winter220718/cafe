package ore.website.ore.service;

import ore.website.ore.model.Menu;
import ore.website.ore.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

}
