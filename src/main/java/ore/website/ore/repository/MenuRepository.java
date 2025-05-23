package ore.website.ore.repository;

import ore.website.ore.model.Category;
import ore.website.ore.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByCtgNo(Long ctgNo);

}
